package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class demo_Controller {

	@Autowired
	private demo_Service all_service;
	
	@GetMapping("/")
	public String hello(){
		return "Hello";
	}
	
	@GetMapping("/all")
	public List<demo_Entity> queryall(){
		return all_service.queryall();
	}
	/////////////////////Table INFO//////////Table INFO////////Table INFO////////////////Table INFO///////Table INFO/////////////////////
	@PostMapping("/insertInfo")
	public Customresponse insert_info(@RequestParam String line_number,@RequestParam String location,@RequestParam String from_info,@RequestParam String to_info
			,@RequestParam String drawing_number,@RequestParam String service,@RequestParam String material,@RequestParam Date inservice_date
			,@RequestParam int pipe_size,@RequestParam int original_thickness,@RequestParam int stress,@RequestParam int joint_efficiency
			,@RequestParam int ca,@RequestParam int design_life,@RequestParam int design_pressure,@RequestParam int operating_pressure
			,@RequestParam int design_temperature,@RequestParam int operating_temperature) {
		Customresponse res = new Customresponse();
		try {
			all_service.insert_info(line_number, location, from_info, to_info, drawing_number, service, material
					, inservice_date, pipe_size, original_thickness, stress,
					joint_efficiency, ca, design_life, design_pressure, operating_pressure, design_temperature, operating_temperature);
			res.setMessage("Success...");
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	@PostMapping("/updateInfo")
	public Customresponse update_info(@RequestParam String line_number,@RequestParam String location,@RequestParam String from_info,@RequestParam String to_info
			,@RequestParam String drawing_number,@RequestParam String service,@RequestParam String material,@RequestParam Date inservice_date
			,@RequestParam int pipe_size,@RequestParam int original_thickness,@RequestParam int stress,@RequestParam int joint_efficiency
			,@RequestParam int ca,@RequestParam int design_life,@RequestParam int design_pressure,@RequestParam int operating_pressure
			,@RequestParam int design_temperature,@RequestParam int operating_temperature,@RequestParam String line_number2) {
		Customresponse res = new Customresponse();
		try {
			all_service.update_info(line_number, location, from_info, to_info, drawing_number, service, material
					, inservice_date, pipe_size, original_thickness, stress,
					joint_efficiency, ca, design_life, design_pressure, operating_pressure, design_temperature, operating_temperature,line_number2);
			res.setMessage("Success...");
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	@PostMapping("/deleteInfo")
	public Customresponse delete_info(@RequestParam String line_number) {
		Customresponse res = new Customresponse();
		try {
			all_service.delete_info(line_number);
			res.setMessage("Success...");
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	@GetMapping("/selectByLineNumberInfo/{line_number}")
	public Customresponse selectByLine_number(@PathVariable String line_number){
		Customresponse res = new Customresponse();
		try {
			res.setMessage(all_service.selectByLine_numberInfo(line_number));
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	
	@GetMapping("/selectAllInfo")
	public Customresponse selectAllInfo(){
		Customresponse res = new Customresponse();
		try {
			res.setMessage(all_service.selectAllInfo());
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	//////////////////////////END Table INFO//////////////////////////END Table INFO///////////////END Table INFO////////////END Table INFO////////////
	
	@PostMapping("/insertcml")
	public Customresponse insert_cml(@RequestParam String line_number, @RequestParam String cml_description, @RequestParam int cml_number, @RequestParam float  actual_outside_diameter
			, @RequestParam float  design_thickness, @RequestParam float  structural_thickness, @RequestParam float  required_thickness) {
		Customresponse res = new Customresponse();
		try {
			res.setMessage(all_service.insert_cml(line_number, cml_description, cml_number, actual_outside_diameter, design_thickness, structural_thickness, required_thickness));
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	
	@GetMapping("/selectByLineNumberCML/{line_number}")
	public Customresponse selectByLine_number_cml(@PathVariable String line_number) {
		Customresponse res = new Customresponse();
		try {
			res.setMessage(all_service.selectByLine_number_cml(line_number));
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
	
	@GetMapping("/deleteByLineNumberCML/{line_number}")
	public Customresponse deleteByLine_number_cml(@PathVariable String line_number) {
		Customresponse res = new Customresponse();
		try {
			res.setMessage(all_service.deleteByLine_number_cml(line_number));
			res.setSuccess(true);
		}
		catch(Exception e){
			res.setMessage(e);
			res.setSuccess(false);
		}
		return res;
	}
}
