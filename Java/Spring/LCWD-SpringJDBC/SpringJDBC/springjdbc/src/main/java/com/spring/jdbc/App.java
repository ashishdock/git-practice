package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My program started.");
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class); 
		
		
		// VIEW 1 record from DB table
		Student student = studentDao.getStudent(333);
		System.out.println(student);
		
		// VIEW ALL RECORDS from DB table
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
		
		/*
		 * //DELETE int result = studentDao.delete(455);
		 * System.out.println("Deleted the student data of id: 455. Deleted rows: " +
		 * result);
		 * 
		 */		
		/*
		 * Student student = new Student(); student.setId(455);
		 * student.setName("Dhiraj"); student.setCity("Chennai");
		 * 
		 * int result = studentDao.change(student);
		 * System.out.println("Student data changed of studentid: " + student.getId() +
		 * ".");
		 */
		/*
		 * Student student = new Student(); student.setId(333);
		 * student.setName("John Doe"); student.setCity("Somewhere");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("student added: " + result);
		 */
		
		
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
//
//		// fire query
//		
//		int result = template.update(query, 455, "Uttam Kumar", "Dehradoon");
//		System.out.println("number of record inserted: " + result);

	}
}
