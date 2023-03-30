package com.course.Basics.SpringIntro.Part2.basicMethods;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.Basics.SpringIntro.Part1.excercise.service.BusinessModel;

public class XMLConfig {
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("XMLConfig.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean(BusinessModel.class).findMax());
		}
	}
}
