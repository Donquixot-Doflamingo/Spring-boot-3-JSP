package com.course.Basics.springdbc.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {
	
	@Autowired
	private JdbcTemplate temp;
	
	private static String INSERT_QUERY = 
			"""
					insert into course_jdbc(id, name, author)
					values(1, 'Learn JDBC', 'Harsh')
					""";
	private static String INSERT_QUERY_COURSE = 
			"""
					insert into course_jdbc(id, name, author)
					values(?, ?, ?)
					""";
	
	private static String DELETE_QUERY_COURSE = 
			"""
					delete from course_jdbc
					where id = ?
					""";
	
	private static String SELECT_QUERY_COURSE = 
			"""
					select * from course_jdbc
					where id = ?
					""";
	
	public void insert() {
		temp.update(INSERT_QUERY);
	}
	
	public void insert(CourseJdbc course) {
		temp.update(INSERT_QUERY_COURSE, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		temp.update(DELETE_QUERY_COURSE,id);
	}
	
	public CourseJdbc selectById(long id) {
		return temp.queryForObject(SELECT_QUERY_COURSE, 
				new BeanPropertyRowMapper<>(CourseJdbc.class), id);
		// result set will be return to the Bean and called rowMapper
	}
	
	
}
