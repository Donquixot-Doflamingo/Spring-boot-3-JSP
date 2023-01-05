package com.course.couplingBasics.coupling2.main;

import com.course.couplingBasics.coupling2.support.GameRunnerCoupling2;
import com.course.couplingBasics.coupling2.support.GamingConsoleCoupling2;
import com.course.couplingBasics.coupling2.support.MarioGameCoupling2;
import com.course.couplingBasics.coupling2.support.SuperContraGameCoupling2;

public class AppRunnerCoupling2 {
	public static void main(String[] args) {
		GamingConsoleCoupling2 game = new MarioGameCoupling2();
		GamingConsoleCoupling2 game1 = new SuperContraGameCoupling2();
		
		GameRunnerCoupling2 gameRunner = new GameRunnerCoupling2(game);
		gameRunner.run();
		
		gameRunner = new GameRunnerCoupling2(game1);
		gameRunner.run();
	}

}
