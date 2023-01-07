package com.course.SpringIntro.Part1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusiness{
	
	// field type of dependency injection
	@Autowired
	Dependency1 dependency1;
	
	@Autowired
	Dependency2 dependency2;


	// setter type of dependency injection
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter injection of dependency1");
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter injection of dependency1");
		this.dependency2 = dependency2;
	}
	
	// constructor type of dependency injection
	@Autowired
	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("constructor injection of your business");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	/*
	 * If we are using constructor based then we don't have to add @Autoweired in them else spring will do it for us
	 * also we don't hae to autowire any fields in this case if using lombok then add required args construtors is enough*/
	
	@Override
	public String toString() {
		return "YourBusiness [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}

	
}

@Component
class Dependency1{

	@Override
	public String toString() {
		return "Dependency1 []";
	}
	
}

@Component
class Dependency2{
	@Override
	public String toString() {
		return "Dependency2 []";
	}
}

@ComponentScan
@Configuration
public class DependencyInjection {
	
	public static void main(String ...args) {
		try(var context = new AnnotationConfigApplicationContext(DependencyInjection.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusiness.class));
		}
	}
}
