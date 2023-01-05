package com.course.couplingBasics.basicSpring;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasicClass {
	public static void main(String[] args) {
		// launching spring context
		try(var context = new AnnotationConfigApplicationContext(SpringBasicConfuguration.class)){
			// defining bean in configuration class
			
			// retrieving beans managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("addressL"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(List.class));
			System.out.println(context.getBean("identity2"));
			System.out.println(context.getBean("identity3UsingQualifier"));
			
		/*
		 	not a good way to call as if i return list of any item i will call List.class and 
		 	it is really not good if two return type of list is present in the beans no unique bean 
		 	found exception will be thrown also if two beans return same class we will get the same exception
			to solve this problem we use @primary annotation on top of the bean to denote what to use in that scenario
			to get the name of all the beans present in the IOC container
		*/
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			// to get count of all the beans in the IOC container
			System.out.println(context.getBeanDefinitionCount());
		}
	}
}
