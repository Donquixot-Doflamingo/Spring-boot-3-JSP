package com.course.couplingBasics.coupling1;

import com.course.couplingBasics.coupling1.suportClasses.GameRunnerCoupling1;
import com.course.couplingBasics.coupling1.suportClasses.MarioGameCoupling1;

public class AppGamingCoupling1 {

	public static void main(String[] args) {
		var marioGame = new MarioGameCoupling1();
		var gameRunner = new GameRunnerCoupling1(marioGame);
		gameRunner.run();
		
	}

}
