package com.course.Basics.couplingBasics.coupling3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.course.Basics.couplingBasics.coupling2.support.GameRunnerCoupling2;
import com.course.Basics.couplingBasics.coupling2.support.GamingConsoleCoupling2;
import com.course.Basics.couplingBasics.coupling3.support.AppConfig;

public class AppFunction {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(AppConfig.class)){
			context.getBean(GamingConsoleCoupling2.class).up();
			context.getBean(GameRunnerCoupling2.class).run();
		}
	}
	
}
