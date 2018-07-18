package com.servdemo.org.repo;


	
	import java.util.List;

	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.CrudRepository;


	import com.servdemo.org.pojo.Student;


	public interface SubjectRepo extends CrudRepository<Student, Long> {

}
