package com.course.Basics.springBootIntro.Part1.helloWorldAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private PropertiesAcess p;

	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return Arrays.asList(
				new Courses(1,"One Piece" , "God Oda"),
				new Courses(2, "Naruto", "Kishimoto")
		);
	}
	
	@GetMapping("/properties")
	public PropertiesAcess getP(){
		return p;
	}
	
//	@GetMapping("/propertiesset")
//	public PropertiesAcess getP(String url, String key, String username){
//		p.setKey(key);
//		p.setUrl(url);
//		p.setUserName(username);
//		return p;
//	}
}
