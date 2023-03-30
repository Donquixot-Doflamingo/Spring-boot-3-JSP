package com.course.Basics.couplingBasics.coupling2.support;

public class SuperContraGameCoupling2 implements GamingConsoleCoupling2{
	
	@Override
	public void up() {
		System.out.println("contra forward");
	}

	@Override
	public void down() {
		System.out.println("contra going down");

	}

	@Override
	public void right() {
		System.out.println("contra going right");
	}

	@Override
	public void left() {
		System.out.println("contra going left");
	}
}
