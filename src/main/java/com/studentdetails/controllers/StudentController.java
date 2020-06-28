package com.studentdetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studentdetails.model.Student;
import com.studentdetails.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

    //the welcome page
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

    //show the add student form and also pass an empty backing bean object to store the form field values
	@RequestMapping(value = "/addNewStudent", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addStudent", "stu", new Student());
	}


    //Get the form field values which are populated using the backing bean and store it in db
	@RequestMapping(value = "/addNewStudent", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("stu") Student stu) {
		studentService.insertStudent(stu);
		List<Student> students = studentService.getAllStudents();
		ModelAndView model = new ModelAndView("getStudents");
		model.addObject("students", students);
		return model;
	}

    //show all employees saved in database
	@RequestMapping("/getStudents")
	public ModelAndView getStudents() {
		List<Student> students = studentService.getAllStudents();
		ModelAndView model = new ModelAndView("getStudents");
		model.addObject("students", students);
		return model;
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView processDelete(@ModelAttribute("stu1") Student stu) {
		studentService.deleteStudent(stu);
		List<Student> students = studentService.getAllStudents();
		ModelAndView model = new ModelAndView("deleteStudent");
		model.addObject("students", students);
		return model;
	}
		
		@RequestMapping(value = "/updateStudent", method = RequestMethod.GET)
		public ModelAndView processUpdate(@ModelAttribute("stu2") Student stu) {
			studentService.updateStudent(stu);
			List<Student> students = studentService.getAllStudents();
			ModelAndView model = new ModelAndView("updateStudent");
			model.addObject("students", students);
			return model;

	}
	@RequestMapping(value="/findStudent",method = RequestMethod.GET)
	public ModelAndView FindStudent(@ModelAttribute("stu") Student stu) {
		studentService.FindStudentById(stu);
		List<Student> students = studentService.getAllStudents();
		ModelAndView model = new ModelAndView("findStudent");
		model.addObject("students", students);
		return model;
	}
	

}