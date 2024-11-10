package com.jsp.prc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.prc.entity.Student;

@Repository
public class StudentDao {
	
	@Autowired
	private EntityManager entityManager;
	
	public void saveStudent(Student student) {
		EntityTransaction tran=entityManager.getTransaction();
		tran.begin();
		entityManager.persist(student);
		tran.commit();
	}
	
	public List<Student> getAllStudent(){
		Query q = entityManager.createQuery("select s from Student s");
		return q.getResultList();
	}
	
	public void deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		EntityTransaction tran=entityManager.getTransaction();
		tran.begin();
		entityManager.remove(student);
		tran.commit();
	}
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}
	public void updateStudent(Student student) {
		EntityTransaction tran=entityManager.getTransaction();
		tran.begin();
		entityManager.merge(student);
		tran.commit();
	}

}
