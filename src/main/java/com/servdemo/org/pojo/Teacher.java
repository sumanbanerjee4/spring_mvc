package com.servdemo.org.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	public Teacher(String firstName) {
	
		FirstName = firstName;
	}
	private Long id;
Teacher(){}

	Set<Student> student ;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "Teacher_Student", 
			joinColumns = { @JoinColumn(name = "teacher_id") }, 
			inverseJoinColumns = { @JoinColumn(name = "student_id") }
			)   
	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Teacher( String firstName, String lastName, String qualification, String experience,Set<Student> student) {


		this.FirstName = firstName;
		this.LastName = lastName;
		this.Qualification = qualification;
		this.Experience = experience;
		this.student = student;

	}

	

	public Teacher( String firstName,Set<Student> student) {
		//super();
		this.student = student;
		this.FirstName = firstName;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Qualification=" + Qualification + ", Experience=" + Experience + "]";
	}
	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "Qualification")
	private String Qualification;

	@Column(name = "Experience")
	private String Experience;

	@Id
	@GeneratedValue
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
}
