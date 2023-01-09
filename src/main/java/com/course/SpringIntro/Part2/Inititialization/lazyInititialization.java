package com.course.SpringIntro.Part2.Inititialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	@Override
	public String toString() {
		return "Class A";
	}
}
@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		System.out.println("With Lazy initialization");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something with " + classA.toString());
	}
	
}
@Configuration
@ComponentScan
public class lazyInititialization {
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(lazyInititialization.class)){
			System.out.println("In application Context");
			context.getBean(ClassB.class).doSomething();
		}
	}
}
