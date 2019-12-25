package com.student;

import java.util.ArrayList;
import java.util.List;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.model.Student;

/**
 * DaoPatternDemo, our demo class, will use StudentDao to demonstrate the use of
 * Data Access Object pattern.
 * 
 * @author muna
 *
 */
public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("ALice", 1));
		studentList.add(new Student("Muna", 2));
		studentList.add(new Student("Jhon", 3));

		// adding a new students
		studentDao.addStudents(studentList);
		// get and display all of student
		studentDao.getAllStudents().forEach(System.out::println);
		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// get and display all of student
		studentDao.getAllStudents().forEach(System.out::println);

		// get the student
		Student st = studentDao.getStudent(3);
		System.out.println("Student: [RollNo : " + st.getRollNo() + ", Name : " + st.getName() + " ]");
	}
}
