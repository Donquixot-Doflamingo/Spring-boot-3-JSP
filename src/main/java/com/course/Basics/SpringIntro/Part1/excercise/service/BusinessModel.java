package com.course.Basics.SpringIntro.Part1.excercise.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessModel {
	private DataService service;

	public BusinessModel(DataService service) {
		super();
		this.service = service;
	}
	
	public int findMax() {
		return Arrays.stream(service.retrieveData()).max().orElse(0);
	}
}
