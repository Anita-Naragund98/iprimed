package com.prodapt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello(Model m) {
		m.addAttribute("greeting", "Hello from HelloController");
		return null;
		
	}

}
