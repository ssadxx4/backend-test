package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Info_Repository extends CrudRepository<Info_Entity,Long> {

	@Modifying
	@Query(value = "INSERT INTO info(line_number,location,from_info,to_info,drawing_number"
			+ ",service,material,inservice_date,pipe_size,original_thickness,"
			+ "stress,joint_efficiency,ca,design_life,design_pressure,operating_pressure"
			+ ",design_temperature,oparating_temperature) "
			+ "VALUES(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16,?17,?18)" ,nativeQuery = true)
	Integer insert(String line_number,String location,String from,String to
			,String drawing_number,String service,String material,Date inservice_date
			,int pipe_size,int original_thickness,int stress,int joint_efficiency
			,int ca,int design_life,int design_pressure,int operating_pressure
			,int design_tempereture,int oparating_temperature);
	
	@Modifying
	@Query(value = "UPDATE info SET line_number = ?1,location =?2,from_info = ?3,to_info = ?4,drawing_number = ?5"
			+ ",service = ?6,material = ?7,inservice_date = ?8,pipe_size = ?9,original_thickness = ?10,"
			+ "stress = ?11,joint_efficiency = ?12,ca = ?13 ,design_life = ?14,design_pressure = ?15,operating_pressure = ?16"
			+ ",design_temperature = ?17,oparating_temperature = ?18 WHERE line_number = ?19",nativeQuery = true)
	Integer update(String line_number,String location,String from,String to
			,String drawing_number,String service,String material,Date inservice_date
			,int pipe_size,int original_thickness,int stress,int joint_efficiency
			,int ca,int design_life,int design_pressure,int operating_pressure
			,int design_tempereture,int oparating_temperature,String line_number2);
	
	@Modifying
	@Query(value = "DELETE FROM info WHERE line_number = ?1",nativeQuery = true)
	Integer delete(String line_number);
	
	@Query(value = "SELECT * FROM info", nativeQuery = true)
	List<Info_Entity> selectAllInfo();
	
	@Query(value = "SELECT * FROM info WHERE line_number = ?1", nativeQuery = true)
	List<Info_Entity> selectByLine_numberInfo(String line_number);
}
