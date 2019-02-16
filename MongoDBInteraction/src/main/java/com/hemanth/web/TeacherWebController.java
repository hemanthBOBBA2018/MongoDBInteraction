package com.hemanth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherWebController {
	
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("name") String name) {
		return "index";
	}

}
