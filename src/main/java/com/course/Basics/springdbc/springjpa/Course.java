package com.course.Basics.springdbc.springjpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	private Long id;
	
	private String name;
	
	private String author;
}
