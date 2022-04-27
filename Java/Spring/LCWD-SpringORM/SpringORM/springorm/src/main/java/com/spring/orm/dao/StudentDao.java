package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// save student data
	@Transactional
	public int insert(Student student) {
		// insert
		Integer i = (Integer) this.getHibernateTemplate().save(student);
		return i;
	}

	// get the single data(object)
	public Student getStudent(int sid) {
		Student student = this.hibernateTemplate.get(Student.class, sid);
		return student;
	}

	// get all students(all rows)
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	// deleting the rows
	@Transactional
	public void deleteStudent(int sid)
	{
		Student student = this.hibernateTemplate.get(Student.class, sid);
		this.hibernateTemplate.delete(student);
	}

	// updating data...
	@Transactional
	public void updateStudent(Student student) {
		Student student = this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
