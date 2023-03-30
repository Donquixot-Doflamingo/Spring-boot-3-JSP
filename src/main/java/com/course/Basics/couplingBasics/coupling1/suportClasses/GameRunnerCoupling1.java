package com.course.Basics.couplingBasics.coupling1.suportClasses;

public class GameRunnerCoupling1 {

	MarioGameCoupling1 marioGame;	
	
	public GameRunnerCoupling1(MarioGameCoupling1 marioGame) {
		this.marioGame = marioGame;
	}

	public void run() {
		System.out.println("Running game" + marioGame);
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
		
	}

}
