package com.servdemo.org.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.servdemo.org.pojo.Student;


public interface StudentRepo extends CrudRepository<Student, Double> {
	 @Query(value="SELECT Student.First_Name FROM Student INNER JOIN Board ON Board.id = Student.Student_Board_Id where Board.Board_name='ICSE'",
			 nativeQuery=true)
	    public List<Student> findByBoard();
	 
}


