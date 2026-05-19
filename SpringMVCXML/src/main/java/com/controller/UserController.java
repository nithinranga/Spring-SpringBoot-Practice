package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String user() {
		return "Hi Fayaz";
	}
	
	@RequestMapping("/user")
	public String userData(Model model) {
		
		model.addAttribute("name", "Fayaz");
		model.addAttribute("company", "FLM");
		return "user";
	}
	
	@RequestMapping("/data")
	public String data() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(HttpServletRequest request, Model model) {
		
		String email = request.getParameter("email");
		
		String password = request.getParameter("password");
		
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "data";
	}

}
