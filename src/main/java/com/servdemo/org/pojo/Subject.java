package com.servdemo.org.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	
	int id;
	private String subjectName;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	
	public Subject(String subjectName) {
//		super();
		this.subjectName = subjectName;
		//this.student = student;
	}
	 
	public Subject(String subject, Student student) {
//		super();
		this.subjectName = subject;
		this.student = student;
	}


public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


private Student student;
	
     @ManyToOne
	 @JoinColumn(name = "student_subject_id")
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
