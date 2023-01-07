package com.course.SpringIntro.Part1.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerB {

	private GamingConsoleB game;	
	
	public GameRunnerB(@Qualifier("SpuerContraGame") GamingConsoleB game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game" + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
