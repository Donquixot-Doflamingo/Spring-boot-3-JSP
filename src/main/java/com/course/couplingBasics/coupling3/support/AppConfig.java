package com.course.couplingBasics.coupling3.support;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.course.couplingBasics.coupling2.support.GameRunnerCoupling2;
import com.course.couplingBasics.coupling2.support.GamingConsoleCoupling2;
import com.course.couplingBasics.coupling2.support.MarioGameCoupling2;
import com.course.couplingBasics.coupling2.support.SuperContraGameCoupling2;

@Configuration
public class AppConfig {

	@Bean 
	@Primary
	@Qualifier("mario")
	public GamingConsoleCoupling2 game() {
		return new MarioGameCoupling2();
	}
	
	@Bean 
	@Qualifier("contra")
	public GamingConsoleCoupling2 game2() {
		return new SuperContraGameCoupling2();
	}
	
	@Bean 
	public GameRunnerCoupling2 gameRunner(@Qualifier("contra") GamingConsoleCoupling2 game) {
		return new GameRunnerCoupling2(game);
	}
	
}
