package com.course.ProjectUnderstading.MiniProject1;

import com.course.ProjectUnderstading.MiniProject1.Game.GameRunner;
import com.course.ProjectUnderstading.MiniProject1.Game.MarioGame;

public class AppGaming {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
