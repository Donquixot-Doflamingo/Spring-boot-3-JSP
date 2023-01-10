package com.course.SpringIntro.Part1.excercise.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.course.SpringIntro.Part1.excercise.service.DataService;

//@Component
@Repository
@Primary
public class MongoDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {10,2,03,40,50,60};
	}

}
