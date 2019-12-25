package com.student.dao;

import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

/**
 * StudentDaoImpl is a concrete class implementing Data Access Object Interface
 * 
 * @author mouna.chabaane
 *
 */
public class StudentDaoImpl implements StudentDao {

	List<Student> students = new ArrayList<Student>();

	public List<Student> getAllStudents() {

		return students;
	}

	public Student getStudent(int rollNo) {
		Student student = students.stream().filter(x -> x.getRollNo() == rollNo).findFirst().orElse(null);
		return student;
	}

	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	public void addStudents(List<Student> studentList) {
		students.addAll(studentList);

	}

}
