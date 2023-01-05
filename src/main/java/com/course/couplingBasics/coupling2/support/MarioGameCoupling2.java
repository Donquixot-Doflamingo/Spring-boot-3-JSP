package com.course.couplingBasics.coupling2.support;

public class MarioGameCoupling2 implements GamingConsoleCoupling2 {

	@Override
	public void up() {
		System.out.println("mario jump");
	}

	@Override
	public void down() {
		System.out.println("mario going down the pipe");

	}

	@Override
	public void right() {
		System.out.println("mario going forward");
	}

	@Override
	public void left() {
		System.out.println("mario going back");
	}

}
