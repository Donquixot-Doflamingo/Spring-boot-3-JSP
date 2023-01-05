package com.course.couplingBasics.coupling1;

import com.course.couplingBasics.coupling1.suportClasses.GameRunner;
import com.course.couplingBasics.coupling1.suportClasses.MarioGame;

public class AppGaming {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
