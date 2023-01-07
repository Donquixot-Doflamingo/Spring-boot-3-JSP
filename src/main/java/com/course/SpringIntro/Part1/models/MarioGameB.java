package com.course.SpringIntro.Part1.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGameB implements GamingConsoleB{
	public void up() {
		System.out.println("Jumping");
	}
	public void down() {
		System.out.println("Going into hole");	
	}
	public void left() {
		System.out.println("Moving back");
	}
	public void right() {
		System.out.println("Going forward");
	}
}
