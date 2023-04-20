package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface demo_Repository extends CrudRepository<demo_Entity,Long> {

	@Query(value ="SELECT * FROM test_point",nativeQuery = true)
	List<demo_Entity> queryall();
}
