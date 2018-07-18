package com.servdemo.org.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="standard")
public class Standard {

	private Long standard_id;

	
	private String  name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Standard() {};

	private Student student;



	@Id @GeneratedValue
	public Long getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(Long standard_id) {
		this.standard_id = standard_id;
	}
	
	@Override
	public String toString() {
		return "Standard [standard_id=" + standard_id + ", whichStandard=" + name + "]";
	}

	@OneToOne( mappedBy = "standard", 
			cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}