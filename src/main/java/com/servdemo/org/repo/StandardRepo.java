package com.servdemo.org.repo;

import org.springframework.data.repository.CrudRepository;

import com.servdemo.org.pojo.Standard;

public interface StandardRepo extends CrudRepository<Standard, Long> {
//	Standard findByTeacher (Long id);
 Standard findByStudent (Long id);
}