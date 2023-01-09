package com.course.SpringIntro.Part1.excercise.model;

import org.springframework.stereotype.Component;

import com.course.SpringIntro.Part1.excercise.service.DataService;

@Component
public class MySQLDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {1,2,3,4,5,6};
	}

}
