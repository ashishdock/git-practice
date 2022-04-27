package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        
        while (true) {
			System.out.println("PRESS 1 TO ADD A NEW STUDENT");
			System.out.println("PRESS 2 TO DISPLAY ALL STUDENTS");
			System.out.println("PRESS 3 TO GET DETAILS OF A SINGLE STUDENT");
			System.out.println("PRES 4 TO DELETE A STUDENT RECORD");
			System.out.println("PRESS 5 TO UPDATE A STUDENT RECORD");
			System.out.println("PRESS 6 TO EXIT");
		}
        
        try
        {
        	int input = Integer.parseInt(br.readLine());
        	switch(go)
        	{
        	case 1:
        		// add a new record
        		System.out.println("Enter student id: ");
        		int sid = Integer.parseInt(br.readLine());
        		System.out.println("Enter student name: ");
        		String sname = br.readLine();
        		System.out.println("Enter student city: ");
        		String scity = br.readLine();
        		
        		// Creating student object and stting values
        		Student s = new Student();
        		s.setSid(sid);
        		s.setSname(sname);
        		s.setScity(scity);
        		
        		// saving student object to database by calling insert method of studentDao
        		int r = studentDao.insert(s);
        		System.out.println(r + " record added.");
        		System.out.println("*********************************");
        		break;
        	case 2:
        		// display all students
        		List<Student> ss = studentDao.getAllStudents();
        		for (Student s : ss) {
					System.out.println(s.getSid());
					System.out.println(s.getSname());
					System.out.println(s.getScity());
					System.out.println("*************************");
				}
        		break;
        	case 3:
        		// get single student data
        		System.out.println("Enter student ID: ");
        		int sid = Integer.parseInt(br.readLine());
        		Student s = studentDao.getStudent(sid);
        		System.out.println(s);
        		System.out.println("Student ID: " + s.getSid());
        		System.out.println("Student Name: " + s.getSname());
        		System.out.println("Student City: " + s.getScity());
        		System.out.println("------------------------------------------");
        		break;
        	case 4:
        		// delete student
        		System.out.println("Enter the student ID to delete: ");
        		int sid = Integer.parseInt(br.readLine());
        		studentDao.deleteStudent(sid);
        		System.out.println("Student ID: " + sid + " deleted.");
        		break;
        	case 5:
        		// update a student record
        		break;
        	case 6:
        		System.out.println("Thank you for using this application!");
        		go = false;
//        		System.exit(0);
        	}
        }
        catch(Exception e)
        {
        	System.out.println("Invalid input. Try again!");
        	System.out.println(e.getMessage());
        }
        
        System.out.println("See you soon!");
        
//        Student student = new Student(001, "Ashton Smith", "Delhi");
//        int r = studentDao.insert(student);
//        System.out.println("done adding " + r + " record");
        
    }
}
