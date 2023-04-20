package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TP_Repository extends CrudRepository<TP_Entity,Long>{
	
	@Modifying
	@Query(value = "INSERT INTO test_point(line_number, cml_number, tp_number, tb_description, note)"
			+ "VALUES (?1, ?2, ?3, ?4, ?5)" , nativeQuery = true)
	Integer insert_TP(String line_number, int cml_number, int tp_number, int tb_description, String note);
	
	@Modifying
	@Query(value = "UPDATE test_point SET tp_number = ?3, tb_description = ?4, note = ?5"
			+ " WHERE line_number = ?1 and cml_number = ?2 " , nativeQuery = true)
	Integer update_TP(String line_number, int cml_number, int tp_number, int tb_description, String note);
	
	@Modifying
	@Query(value = "DELETE FROM test_point  WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3" , nativeQuery = true)
	Integer delete_TP(String line_number, int cml_number, int tp_number);
	
	@Query(value = "SELECT * FROM test_point", nativeQuery = true)
	List<TP_Entity> selectAllTP();
	
	@Query(value = "SELECT * FROM test_point WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3" , nativeQuery = true)
	List<TP_Entity> selectByTP_number(String line_number, int cml_number, int tp_number);

}
