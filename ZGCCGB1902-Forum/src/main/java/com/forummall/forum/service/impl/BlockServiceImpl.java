package com.forummall.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.forummall.forum.dao.BlockDao;
import com.forummall.forum.entity.Block;
import com.forummall.forum.service.BlockService;

@Service
public class BlockServiceImpl implements BlockService{
	@Autowired
	private BlockDao blockDao;
	
	@Override
	public int insertBlock(Block block) {
		if(block==null)
			throw new IllegalArgumentException("新建版本不可为空");
		if(StringUtils.isEmpty(block.getName()))
			throw new IllegalArgumentException("新建版本名称不可为空");
		int rows = blockDao.insertBlock(block);
		return rows;
	}

}
