package com.servdemo.org.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Student {

	private Address address;
	
	private Standard standard;

	private long id;


	private String firstName;


	private String lastName;


	private String section;

   
    private Board board;
    
    private Set<Subject> subject;
    
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	public Set<Subject> getSubject() {
		return subject;
	}
	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	Set<Teacher> teacher;
    
    public Student(String firstName, Set<Teacher> teacher) {
		//super();
		this.firstName = firstName;
		this.teacher = teacher;
	}
    public Student(String firstName) {
		//super();
		this.firstName = firstName;
		
	}

	@ManyToMany(mappedBy = "student")
    public Set<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}


	  
    
    public Student(String firstName, String lastName,  Board board, Set<Subject> subject,
			 Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//this.section = section;
		this.board = board;
		this.subject = subject;
	
		this.standard = standard;
	}
    

	public Student(String firstName, String lastName, String section, Board board, Set<Subject> subject,
			Address address, Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.board = board;
		this.subject = subject;
		this.address = address;
		this.standard = standard;
	}


  

	
	

	


	public Student() {
		
	}

	


	public Student(String firstName, String lastName, String section, Board board, Address address,
			Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	
		this.board = board;
		this.address = address;
		this.standard = standard;
	}

	public Student(String firstName, String lastName, String section) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	}
	
	public Student(String firstName, String lastName, String section, Address address) {
		
	//	super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.address = address;
	}

	

	public Student( String firstName, String lastName, String section, Board board) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.board = board;
	}

	public Student(String firstName, String lastName, String section, Board board, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		
		this.board = board;
		this.address = address;
	}


	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_address_id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	
	

	@Override
	public String toString() {
		String sub = "";
		if (subject != null) {
         
			for(Subject subject : subject) {
             sub += String.format(
                        "Subject[id=%d, name=%s]%n",
                        subject.getId(), subject.getSubjectName());
            }
        }
		String result = "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ ", board=" + board + ", subject=" + sub + ", address=" + address + ", standard=" + standard + "]";
		return result;
		
		
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_board_id")
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
    
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_standard_id")
	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	
}
