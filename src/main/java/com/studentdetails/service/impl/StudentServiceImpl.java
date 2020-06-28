package com.studentdetails.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdetails.dao.StudentDao;
import com.studentdetails.model.Student;
import com.studentdetails.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
	}
	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(stu);
	}
	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(stu);
	}
	@Override
	public List<Student> FindStudentById(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.FindStudentById(stu);
	}


}