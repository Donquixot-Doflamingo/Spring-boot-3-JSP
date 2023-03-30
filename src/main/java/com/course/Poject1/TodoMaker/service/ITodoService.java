package com.course.Poject1.TodoMaker.service;

import java.time.LocalDate;
import java.util.List;

import com.course.Poject1.TodoMaker.model.Todo;

public interface ITodoService {

	List<Todo> findByUsername();

	void addTodo(String description, String title, LocalDate date);

	void delete(Long id);

	Todo findById(Long id);

	String getCurrentUser();

	void update(String title, String description, Long id, LocalDate targetDate);

}
