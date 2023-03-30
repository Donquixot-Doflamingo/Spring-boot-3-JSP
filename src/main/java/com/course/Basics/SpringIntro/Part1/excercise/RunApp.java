package com.course.Basics.SpringIntro.Part1.excercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.course.Basics.SpringIntro.Part1.excercise.service.BusinessModel;

@Configuration
@ComponentScan
public class RunApp {
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(RunApp.class)){
			System.out.println(context.getBean(BusinessModel.class).findMax());
		}
	}
}
