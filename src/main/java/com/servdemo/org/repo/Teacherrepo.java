package com.servdemo.org.repo;

import org.springframework.data.repository.CrudRepository;


import com.servdemo.org.pojo.Address;
import com.servdemo.org.pojo.Teacher;



public interface Teacherrepo extends CrudRepository<Teacher, Long> {
	    //Area findByTeacher (Long id);
	}