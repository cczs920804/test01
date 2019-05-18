package com.forummall.common.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.mgt.RememberMeManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.forummall.common.service.realm.ShiroUserRealm;


/**Shiro配置文件*/
@Configuration
public class SpringShiroConfig {

	/**单机环境，session交给shiro管理*/
	@Bean
	public DefaultWebSessionManager newSessionManager(){
		DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
		sessionManager.setSessionValidationSchedulerEnabled(true);
		sessionManager.setSessionIdUrlRewritingEnabled(false);
		sessionManager.setSessionValidationInterval(3600 * 1000);
		sessionManager.setGlobalSessionTimeout(3600 * 1000);
		return sessionManager;
	}
	
	//cookie
	public SimpleCookie newCookie() {
		SimpleCookie sc=new SimpleCookie("simpleCookie");
		sc.setMaxAge(7*24*60*60);
		return sc;
	}
	
	//缓存功能管理
	public CacheManager newCacheManager() {
		MemoryConstrainedCacheManager cacheManager=new MemoryConstrainedCacheManager();
		return cacheManager;
	}
	
	//“记住我”功能管理
	public RememberMeManager newRememberMeManager() {
		CookieRememberMeManager cManager=new CookieRememberMeManager();
		cManager.setCookie(newCookie());
		return cManager;
	}

	//web安全管理器
	@Bean("securityManager")
	public SecurityManager newSecurityManager(ShiroUserRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(userRealm);
		securityManager.setSessionManager(newSessionManager());
		securityManager.setRememberMeManager(newRememberMeManager());
		securityManager.setCacheManager(newCacheManager());
		return securityManager;
	}
	
	//资源授权管理器
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
			SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor advisor = 
				new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(securityManager);
		return advisor;
	}

	//生命周期处理器
	@Bean("lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		LifecycleBeanPostProcessor lifecycleBeanPostProcessor = 
				new LifecycleBeanPostProcessor();
		return lifecycleBeanPostProcessor;
	}

	//advisor自动代理创建器，依赖于生命周期处理器
	@Bean
	@DependsOn("lifecycleBeanPostProcessor")
	public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = 
				new DefaultAdvisorAutoProxyCreator();
		return advisorAutoProxyCreator;
	}
	
	//shiro过滤器
	//拦截信息等确定前端地址后填写
	@Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);
        shiroFilter.setLoginUrl("/doLoginUI");
        shiroFilter.setUnauthorizedUrl("/");
        Map<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/bower_components/**", "anon");
        filterMap.put("/build/**", "anon");
        filterMap.put("/dist/**", "anon");
        filterMap.put("/plugins/**", "anon");
        filterMap.put("/user/doLogin","anon");
        filterMap.put("/doLogout", "logout");
        filterMap.put("/**", "user");
        shiroFilter.setFilterChainDefinitionMap(filterMap);
        return shiroFilter;
    }
	
}
