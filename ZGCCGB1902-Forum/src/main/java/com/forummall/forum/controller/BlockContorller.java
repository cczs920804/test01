package com.forummall.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forummall.common.vo.JsonResult;
import com.forummall.forum.entity.Block;
import com.forummall.forum.service.BlockService;

@RequestMapping("/block/")
@Controller
public class BlockContorller {
	@Autowired
	private BlockService blockService;
	
	@RequestMapping("doBlockListUI")
	public String doBlockListUI() {
		return "block_list";
	}
	
	public JsonResult doSaveObjectUI(Block block) {
		blockService.insertBlock(block);
		return new JsonResult("版块添加成功");
		}
}
