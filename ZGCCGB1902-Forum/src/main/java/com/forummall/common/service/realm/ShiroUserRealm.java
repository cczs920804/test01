package com.forummall.common.service.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.forummall.common.dao.MenusDao;
import com.forummall.common.dao.RoleMenusDao;
import com.forummall.common.dao.UserDao;
import com.forummall.common.dao.UserRoleDao;
import com.forummall.common.entity.User;


@Service
public class ShiroUserRealm extends AuthorizingRealm {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	@Autowired
	private RoleMenusDao roleMenusDao;
	
	@Autowired
	private MenusDao menusDao;
	
	@Override
	public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
		//构建凭证匹配对象
				HashedCredentialsMatcher cMatcher=
				new HashedCredentialsMatcher();
				//设置加密算法
				cMatcher.setHashAlgorithmName("MD5");
				//设置加密次数
				cMatcher.setHashIterations(1);
				super.setCredentialsMatcher(cMatcher);
	}
	
	//完成授权信息的获取以及封装
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("获取授权信息:GetAuthorizationInfo");
		//1.获取登陆用户信息
		User user=
		(User)principals.getPrimaryPrincipal();
		//2.基于用户id获取用户对应的角色
		if(user==null)
		throw new AuthorizationException();
		Integer roleId=
		userRoleDao.findRoleIdsByUserId(user.getId());
		//3.基于角色id获取对应的菜单信息
		if(roleId==null)
		throw new AuthorizationException();
		Integer[] array= {};
		List<Integer> menuIds=
		roleMenusDao.findMenuIdsByRoleId(
		roleId);
		if(menuIds==null||menuIds.size()==0)
		throw new AuthorizationException();
		//4.基于菜单id获取对应的权限标识(permisssion)
		List<String> permissions=
		menusDao.findPermissions(
		menuIds.toArray(array));
		if(permissions==null||permissions.size()==0)
		throw new AuthorizationException();
		//5.对权限标识permission进行封装并返回
		Set<String> setPermissions=new HashSet<>();
		for(String p:permissions) {
			if(!StringUtils.isEmpty(p)) {
				setPermissions.add(p);
			}
		}
		SimpleAuthorizationInfo info=
		new SimpleAuthorizationInfo();
		info.setStringPermissions(setPermissions);
		return info;//返回给SecurityManager
	}
	
	//完成认证信息的获取以及封装
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
