package com.course.Basics.springdbc.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerSpring implements CommandLineRunner {
	
	@Autowired
	private CourseJDBCRepo jdbcRepo;

	@Override
	public void run(String... args) throws Exception {
//		jdbcRepo.insert();
//		jdbcRepo.insert(new CourseJdbc(2, "MUSKAN", "How to be a genuis"));
//		jdbcRepo.deleteById(1);
//		System.out.println(jdbcRepo.selectById(2));
		
	}

}
