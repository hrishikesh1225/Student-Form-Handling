package com.studentdetails.dao;


import java.util.List;

import com.studentdetails.model.Student;

public interface StudentDao {
	void insertStudent(Student cus);
	List<Student> getAllStudents();
	void deleteStudent(Student stu);
	void updateStudent(Student stu);
	List<Student> FindStudentById(Student stu);
}