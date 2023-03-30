package com.course.Basics.SpringIntro.Part2.basicMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class someClass{
	private Dependency dependency;

	public someClass(Dependency dependency) {
		super();
		this.dependency = dependency;
		System.out.println("All dependency ready");
	}
	
	@PostConstruct
	public void initiliaze() {
		// runs after dependencies get initialised
		dependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		// ran before bean got destroyed
		System.out.println("Cleaning up ....");
	}
}
@Component
class Dependency{
	public void getReady() {
		System.out.println("Using Some logic");
	}
	
}
@Configuration
@ComponentScan
public class PrePostMethods {
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostMethods.class)){
			System.out.println("In application Context");
		}
	}
}
