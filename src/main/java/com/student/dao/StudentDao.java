package com.student.dao;

import java.util.List;

import com.student.model.Student;

/**
 * StudentDao is a Data Access Object Interface
 * 
 * @author mouna.chabaane
 *
 */
public interface StudentDao {
	public void addStudents(List<Student> students);

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

}
