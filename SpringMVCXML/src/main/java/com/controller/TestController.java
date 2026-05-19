package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hi")
	public String hi() {
		return "Hi";
	}
	
	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Byee Data";
	}

}
