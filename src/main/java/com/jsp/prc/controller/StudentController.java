package com.jsp.prc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.prc.entity.Student;
import com.jsp.prc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/hi")
	public String hi() {
		return "Hi.jsp";
	}
	
	@RequestMapping("/hiall")
	public String hiAll() {
		return "Student.jsp";
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		Student s1=new Student();
		ModelAndView mav =new ModelAndView();
		mav.setViewName("Register.jsp");
		mav.addObject("student",s1);
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView saveStudent(Student s) {
		service.saveStudent(s);
		ModelAndView mav =new ModelAndView();
		List<Student> allStudent = service.getAllStudent();
		mav.setViewName("view.jsp");
		mav.addObject("std",allStudent );
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam int id) {
		service.deleteStudent(id);
		ModelAndView mav =new ModelAndView();
		List<Student> allStudent = service.getAllStudent();
		mav.addObject("std", allStudent);
		mav.setViewName("view.jsp");
		return mav;
	}
	@RequestMapping("/update")
	public ModelAndView updateStudent(@RequestParam int id) {
		Student student = service.getStudentById(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("edit.jsp");
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudent(Student student) {
		service.updateStudent(student);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("view.jsp");
		mav.addObject("std", service.getAllStudent());
		return mav;
	}

	

}
