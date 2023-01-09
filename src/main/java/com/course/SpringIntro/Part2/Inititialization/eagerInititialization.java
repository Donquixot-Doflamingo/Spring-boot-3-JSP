package com.course.SpringIntro.Part2.Inititialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class ClassC{
	@Override
	public String toString() {
		return "Class C";
	}
}
@Component
class ClassD{
	private ClassC classC;

	public ClassD(ClassC classA) {
		super();
		System.out.println("With Eager initialization");
		this.classC = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something with " + classC.toString());
	}
	
}
@Configuration
@ComponentScan
public class eagerInititialization {
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(eagerInititialization.class)){
			System.out.println("In application Context");
			context.getBean(ClassD.class).doSomething();
		}
	}
}
