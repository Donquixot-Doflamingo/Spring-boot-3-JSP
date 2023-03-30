package com.course.Poject1.TodoMaker.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	@GetMapping("/")
	public String goToWelcomePage(ModelMap model) {
		model.put("name", getCurrentUser());
		return "welcome";
	}
	
	private String getCurrentUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
		
	}
}
