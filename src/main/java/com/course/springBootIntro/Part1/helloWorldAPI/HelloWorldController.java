package com.course.springBootIntro.Part1.helloWorldAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return Arrays.asList(
				new Courses(1,"One Piece" , "God Oda"),
				new Courses(2, "Naruto", "Kishimoto")
		);
	}
}
