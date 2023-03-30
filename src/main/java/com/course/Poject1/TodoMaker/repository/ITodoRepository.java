package com.course.Poject1.TodoMaker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.course.Poject1.TodoMaker.model.Todo;

public interface ITodoRepository extends JpaRepository<Todo, Long>, JpaSpecificationExecutor<Todo> {

	List<Todo> findByUsername(String username);

}
