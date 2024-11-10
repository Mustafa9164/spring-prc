package com.jsp.prc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.prc.dao.StudentDao;
import com.jsp.prc.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}
	
	public List<Student> getAllStudent(){
		List<Student> allStudent = dao.getAllStudent();
		if(allStudent.size()>0) {
			for (Student student : allStudent) {
				System.out.println(student.getName());
				System.out.println(student.getPhone());
				System.out.println(student.getEmail());
			}
		}
		return allStudent;
	}
	
	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}
	
	public Student getStudentById(int id) {
		return dao.getStudentById(id);
	}
	
	public void updateStudent(Student student) {
		 dao.updateStudent(student);
	}
	


}
