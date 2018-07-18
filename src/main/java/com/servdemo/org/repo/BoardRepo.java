package com.servdemo.org.repo;

import org.springframework.data.repository.CrudRepository;


import com.servdemo.org.pojo.Board;

public interface BoardRepo extends CrudRepository<Board, Long> {
    //Board findByTeacher (Long id);
    
   
}