package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TN_Repository extends CrudRepository<TN_Entity,Long>{

	@Modifying
	@Query(value = "INSERT INTO thickness(line_number, cml_number, tp_number, thickness_number, inspection_date, actual_thickness) "
			+ "VALUES(?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	Integer insert_TN(String line_number, int cml_number, int tp_number, int thickness_number, Date inspection_date, int actual_thickness);
	
	@Modifying
	@Query(value = "UPDATE thickness SET inspection_date = ?5, actual_thickness = ?6"
			+ " WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3 and thickness_number = ?4", nativeQuery = true)
	Integer update_TN(String line_number, int cml_number, int tp_number, int thickness_number, Date inspection_date, int actual_thickness);
	
	@Modifying
	@Query(value = "DELETE FROM thickness WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3 and thickness_number = ?4", nativeQuery = true)
	Integer delete_TN(String line_number, int cml_number, int tp_number, int thickness_number);
	
	@Query(value = "SELECT * FROM thickness WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3", nativeQuery = true)
	List<TN_Entity> selectAllTP(String line_number, int cml_number, int tp_number);
	
	@Query(value = "SELECT * FROM thickness WHERE line_number = ?1 and cml_number = ?2 and tp_number = ?3 and thickness_number = ?4", nativeQuery = true)
	List<TN_Entity> selectBy_TP_number(String line_number, int cml_number, int tp_number, int thickness_number);
}
