package com.course.Basics.SpringIntro.Part2.basicMethods;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class Class{
}
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassBa{}

@Configuration
@ComponentScan
public class ScopesOfBeans {
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostMethods.class)){
			System.out.println("In application Context");
			// having same hash value means same object
			System.out.println(context.getBean(Class.class));
			System.out.println(context.getBean(Class.class));
			// having different hash value means different object
			System.out.println(context.getBean(ClassBa.class));
			System.out.println(context.getBean(ClassBa.class));
			System.out.println(context.getBean(ClassBa.class));
			System.out.println(context.getBean(ClassBa.class));

		}
	}
}
