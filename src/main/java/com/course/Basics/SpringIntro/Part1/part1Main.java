package com.course.Basics.SpringIntro.Part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.course.Basics.SpringIntro.Part1.models.GameRunnerB;

@Configuration
@ComponentScan
//as we are using them in the same package we don't have to specify the address explicitly
//@ComponentScan("com.course.SpringIntro.Part1.models") 

public class part1Main {
	
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(part1Main.class)){
			context.getBean(GameRunnerB.class).run();
		}
	}
	
}