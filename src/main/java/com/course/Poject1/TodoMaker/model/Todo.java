package com.course.Poject1.TodoMaker.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Size(min = 1, max = 300, message = "Title should have 3 to 300 range of charactares")
	private String title;
	
	private String username;
	
	@Size(min = 3, max = 300, message = "Description should have 3 to 300 range of charactares")
	private String description;
	
	private LocalDate targetDate;
	
	private boolean done;
	
}
