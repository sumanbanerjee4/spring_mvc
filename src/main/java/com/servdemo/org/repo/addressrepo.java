package com.servdemo.org.repo;

import org.springframework.data.repository.CrudRepository;


import com.servdemo.org.pojo.Address;



public interface addressrepo extends CrudRepository<Address, Long> {
	    //Area findByTeacher (Long id);
	}