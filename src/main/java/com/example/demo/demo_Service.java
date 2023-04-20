package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class demo_Service {
	
	@Autowired
	private demo_Repository repo;
	
	@Autowired
	private Info_Repository info_repo;
	
	@Autowired
	private CML_Repository cml_repo;

	public List<demo_Entity> queryall(){
		return repo.queryall();
	}
	/////////////////////Table INFO//////////Table INFO////////Table INFO////////////////Table INFO///////Table INFO/////////////////////
	public Integer insert_info(String line_number,String location,String from,String to
			,String drawing_number,String service,String material,Date inservice_date
			,int pipe_size,int original_thickness,int stress,int joint_efficiency
			,int ca,int design_life,int design_pressure,int operating_pressure
			,int design_tempereture,int oparating_temperature) {
		return info_repo.insert(line_number, location, from, to, drawing_number, service
				, material, inservice_date, pipe_size, original_thickness, stress, joint_efficiency
				, ca, design_life, design_pressure, operating_pressure, design_tempereture, oparating_temperature);
	}
	
	public Integer update_info(String line_number,String location,String from,String to
			,String drawing_number,String service,String material,Date inservice_date
			,int pipe_size,int original_thickness,int stress,int joint_efficiency
			,int ca,int design_life,int design_pressure,int operating_pressure
			,int design_tempereture,int oparating_temperature,String line_number2) {
		return info_repo.update(line_number, location, from, to, drawing_number, service, material, inservice_date
				, pipe_size, original_thickness, stress, joint_efficiency, ca, design_life, design_pressure
				, operating_pressure, design_tempereture, oparating_temperature,line_number2);
	}
	
	public Integer delete_info(String line_number) {
		return info_repo.delete(line_number);
	}
	
	public List<Info_Entity> selectAllInfo(){
		return info_repo.selectAllInfo();
	}
	
	public List<Info_Entity> selectByLine_numberInfo(String line_number){
		return info_repo.selectByLine_numberInfo(line_number);
	}
	//////////////////////////END Table INFO//////////////////////////END Table INFO///////////////END Table INFO////////////END Table INFO////////////
	
    /////////////////////Table CML//////////Table CML////////Table CML////////////////Table CML///////Table CML/////////////////////////
	public Integer insert_cml(String line_number, String cml_description, int cml_number, float  actual_outside_diameter
			, float  design_thickness, float  structural_thickness, float  required_thickness) {
		return cml_repo.insert(line_number, cml_description, cml_number, actual_outside_diameter, design_thickness, structural_thickness, required_thickness);
	}
	
	public Integer update_cml(String line_number, String cml_description, int cml_number, float  actual_outside_diameter
			, float  design_thickness, float  structural_thickness, float  required_thickness) {
		return cml_repo.update(line_number, cml_description, cml_number, actual_outside_diameter, design_thickness, structural_thickness, required_thickness);
	}
	
	public Integer delete_one_cml(String line_number, int cml_number) {
		return cml_repo.deleteOne(line_number, cml_number);
	}
	
	public Integer deleteByLine_number_cml(String line_number) {
		return cml_repo.deleteByLine_number_cml(line_number);
	}
	
	public List<CML_Entity> selectAllCML(){
		return cml_repo.selectAllCML();
	}
	
	public List<CML_Entity> selectByLine_number_cml(String line_number){
		return cml_repo.selectByLine_number(line_number);
	}
	
	/////////////////////END Table CML//////////END Table CML////////END Table CML////////////////END Table CML///////END Table CML/////////////////////
	
	/////////////////////Table TP//////////Table TP////////Table TP////////////////Table TP///////Table TP/////////////////////////
	/////////////////////END Table TP//////////END Table TP////////END Table TP////////////////END Table TP///////END Table TP/////////////////////
}
