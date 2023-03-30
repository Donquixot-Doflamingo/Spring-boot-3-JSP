package com.course.Poject1.TodoMaker.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.course.Poject1.TodoMaker.model.Todo;
import com.course.Poject1.TodoMaker.repository.ITodoRepository;
import com.course.Poject1.TodoMaker.service.ITodoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService implements ITodoService{

	private final ITodoRepository repo;
	
	@Override
	public List<Todo> findByUsername(){
		return repo.findByUsername(getCurrentUser());
	}
	
	@Override
	public void addTodo(String description, String title, LocalDate date) {
		mapper(description, title, date, new Todo());
	}
	
	private Todo mapper(String title, String description, LocalDate date, Todo t) {
		t.setDescription(description);
		t.setTitle(title);
		t.setDone(false);
		t.setTargetDate(date);
		t.setUsername(getCurrentUser());
		return repo.save(t);
	}
	
	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	@Override
	public Todo findById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void update(String title, String description, Long id, LocalDate targetDate) {
		mapper(title, description, targetDate, findById(id));
	}
	
	@Override
	public String getCurrentUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
		
	}

}
