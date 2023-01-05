package com.course.couplingBasics.coupling2.support;

public class GameRunnerCoupling2 {

	private GamingConsoleCoupling2 game;	
	
	public GameRunnerCoupling2(GamingConsoleCoupling2 game) {
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
