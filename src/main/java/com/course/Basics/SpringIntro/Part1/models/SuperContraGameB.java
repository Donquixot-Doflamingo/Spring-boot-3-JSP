package com.course.Basics.SpringIntro.Part1.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SpuerContraGame")
public class SuperContraGameB implements GamingConsoleB{
	
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
