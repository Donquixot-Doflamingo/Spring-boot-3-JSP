package com.course.Poject1.TodoMaker.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.course.Poject1.TodoMaker.model.Todo;
import com.course.Poject1.TodoMaker.service.ITodoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@SessionAttributes("name") //  if you want to use the variables used in previous call you can use this annotation to make it available 
public class TodoController {// for a session

	private final ITodoService todoS;
	
	@RequestMapping("list-todo")
	public String listAllTodo(ModelMap model) {
		List<Todo> todos = todoS.findByUsername();
		model.addAttribute("todos", todos);
		return "listTodo";
	}
	
	@GetMapping("add-todo")
	public String addTodoPage(ModelMap model) {
		String username = todoS.getCurrentUser();
		Todo todo = new Todo(0l, "", username, "", LocalDate.now(), false);
		model.put("todo", todo);
		return "addTodo";
	}
	
	@PostMapping("add-todo")
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "addTodo";
		}
		todoS.addTodo(todo.getDescription(), todo.getTitle(), todo.getTargetDate());
		return "redirect:list-todo ";// this will redirect it to the same url and display its data
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam Long id) {
		todoS.delete(id);
		return "redirect:list-todo ";

	}
	
	@GetMapping("update-todo")
	public String showUpdateTodo(@RequestParam Long id, ModelMap model) {
		Todo todo = todoS.findById(id);
		model.put("todo", todo);
		return "addTodo";

	}
	
	@PostMapping("update-todo")
	public String updateTodo(@RequestParam Long id, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "addTodo";
		}
		todoS.update(todo.getTitle(), todo.getDescription(), id, todo.getTargetDate());
		return "redirect:list-todo ";

	}
}
