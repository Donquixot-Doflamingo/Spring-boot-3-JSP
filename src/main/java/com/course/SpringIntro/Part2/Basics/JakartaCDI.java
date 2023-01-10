package com.course.SpringIntro.Part2.Basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
//@Component work same as this
class BusinessClass{
	private DataServicing data;
	
	
	public DataServicing getData() {
		return data;
	}

//	@Autowired work same as this
	@Inject
	public void setData(DataServicing data) {
		System.out.println("Setter injection    1");
		this.data = data;
	}
	
	
}

@Component
class DataServicing {
	
}

@ComponentScan
@Configuration
public class JakartaCDI {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(JakartaCDI.class)) {
			System.out.println(context.getBean(BusinessClass.class).getData());
		}
	}
}
