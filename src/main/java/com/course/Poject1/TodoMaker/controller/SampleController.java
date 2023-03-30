package com.course.Poject1.TodoMaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class SampleController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String hello() {
		return "Hello! What are you doing?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String helloHtml() {
		StringBuffer s = new StringBuffer();
		s.append("""
				<html>
				<head>
				<title> Hello here</title>
				</head>
				<body>
				<p>Hello there to the world out there</p>
				</body>
				</html>
				""");
		return s.toString();
	}
	
	@RequestMapping("say-hello-jsp")

	public String helloJsp() {
		return "sayHello";
	}
	
}
