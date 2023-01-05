package com.course.ProjectUnderstading.MiniProject1.Game;

public class GameRunner {

	MarioGame marioGame;	
	
	public GameRunner(MarioGame marioGame) {
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
