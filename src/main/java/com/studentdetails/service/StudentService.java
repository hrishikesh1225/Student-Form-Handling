package com.studentdetails.service;

import java.util.List;

import com.studentdetails.model.Student;

public interface StudentService {
	void insertStudent(Student stu);
	List<Student> getAllStudents();
	void deleteStudent(Student stu);
	void updateStudent(Student stu);
	List<Student> FindStudentById(Student stu);
}
