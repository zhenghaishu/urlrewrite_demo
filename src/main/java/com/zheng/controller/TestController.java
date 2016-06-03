package com.zheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class TestController {
	@RequestMapping("/toLoginIndex")
	public String toLoginIndex(){
		return "/test";
	}
}
