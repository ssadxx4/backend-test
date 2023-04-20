package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CML_Repository extends CrudRepository<CML_Entity,Long>{

	@Modifying
	@Query(value = "INSERT INTO cml(line_number, cml_description, cml_number, actual_outside_diameter"
			+ ", design_thickness, structural_thickness, required_thickness)"
			+ " VALUES(?1,?2,?3,?4,?5,?6,?7)", nativeQuery = true)
	Integer insert(String line_number, String cml_description, int cml_number, 
			float  actual_outside_diameter, float  design_thickness, float  structural_thickness, float  required_thickness);
	
	@Modifying
	@Query(value = "UPDATE cml SET cml_description = ?2, actual_outside_diameter = ?4"
			+ ", design_thickness = ?5, structural_thickness = ?6, required_thickness = ?7"
			+ " WHERE line_number = ?1 and cml_number =?3", nativeQuery = true)
	Integer update(String line_number, String cml_description, int cml_number, 
			float  actual_outside_diameter, float  design_thickness, float  structural_thickness, float  required_thickness);
	
	@Modifying
	@Query(value = "DELETE FROM cml WHERE line_number = ?1 and cml_number =?2", nativeQuery = true)
	Integer deleteOne(String line_number,int cml_number);
	
	@Modifying
	@Query(value = "DELETE FROM cml WHERE line_number = ?1", nativeQuery = true)
	Integer deleteByLine_number_cml(String line_number);
	
	@Query(value = "SELECT * FROM cml", nativeQuery = true)
	List<CML_Entity> selectAllCML();
	
	@Query(value = "SELECT * FROM cml WHERE line_number = ?1 ORDER BY cml_number asc", nativeQuery = true)
	List<CML_Entity> selectByLine_number(String line_number);
}
