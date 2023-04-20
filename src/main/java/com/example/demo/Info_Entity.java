package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info")
public class Info_Entity {

	@Id
	@Column(name ="line_number")
	private String line_number;
	
	@Column(name ="location")
	private String location;
	
	@Column(name ="from_info")
	private String from_info;
	
	@Column(name ="to_info")
	private String to_info;
	
	@Column(name ="drawing_number")
	private String drawing_number;
	
	@Column(name ="service")
	private String service;
	
	@Column(name ="material")
	private String material;
	
	@Column(name = "inservice_date")
	private Date inservice_date;
	
	@Column(name = "pipe_size")
	private int pipe_size;
	
	@Column(name = "original_thickness")
	private int original_thickness;
	
	@Column(name = "stress")
	private int stress;
	
	@Column(name = "joint_efficiency")
	private int joint_efficiency;
	
	@Column(name = "ca")
	private int ca;
	
	@Column(name = "design_life")
	private int design_life;
	
	@Column(name = "design_pressure")
	private int design_pressure;
	
	@Column(name = "operating_pressure")
	private int operating_pressure;
	
	@Column(name = "design_temperature")
	private int design_temperature;
	
	@Column(name = "oparating_temperature")
	private int oparating_temperature;
	
	public Info_Entity() {}

	public Info_Entity(String line_number, String location, String from_info, String to_info, String drawing_number,
			String service, String material, Date inservice_date, int pipe_size, int original_thickness, int stress,
			int joint_efficiency, int ca, int design_life, int design_pressure, int operating_pressure,
			int design_temperature, int oparating_temperature) {
		super();
		this.line_number = line_number;
		this.location = location;
		this.from_info = from_info;
		this.to_info = to_info;
		this.drawing_number = drawing_number;
		this.service = service;
		this.material = material;
		this.inservice_date = inservice_date;
		this.pipe_size = pipe_size;
		this.original_thickness = original_thickness;
		this.stress = stress;
		this.joint_efficiency = joint_efficiency;
		this.ca = ca;
		this.design_life = design_life;
		this.design_pressure = design_pressure;
		this.operating_pressure = operating_pressure;
		this.design_temperature = design_temperature;
		this.oparating_temperature = oparating_temperature;
	}

	public String getLine_number() {
		return line_number;
	}

	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFrom_info() {
		return from_info;
	}

	public void setFrom_info(String from_info) {
		this.from_info = from_info;
	}

	public String getTo_info() {
		return to_info;
	}

	public void setTo_info(String to_info) {
		this.to_info = to_info;
	}

	public String getDrawing_number() {
		return drawing_number;
	}

	public void setDrawing_number(String drawing_number) {
		this.drawing_number = drawing_number;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Date getInservice_date() {
		return inservice_date;
	}

	public void setInservice_date(Date inservice_date) {
		this.inservice_date = inservice_date;
	}

	public int getPipe_size() {
		return pipe_size;
	}

	public void setPipe_size(int pipe_size) {
		this.pipe_size = pipe_size;
	}

	public int getOriginal_thickness() {
		return original_thickness;
	}

	public void setOriginal_thickness(int original_thickness) {
		this.original_thickness = original_thickness;
	}

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}

	public int getJoint_efficiency() {
		return joint_efficiency;
	}

	public void setJoint_efficiency(int joint_efficiency) {
		this.joint_efficiency = joint_efficiency;
	}

	public int getCa() {
		return ca;
	}

	public void setCa(int ca) {
		this.ca = ca;
	}

	public int getDesign_life() {
		return design_life;
	}

	public void setDesign_life(int design_life) {
		this.design_life = design_life;
	}

	public int getDesign_pressure() {
		return design_pressure;
	}

	public void setDesign_pressure(int design_pressure) {
		this.design_pressure = design_pressure;
	}

	public int getOperating_pressure() {
		return operating_pressure;
	}

	public void setOperating_pressure(int operating_pressure) {
		this.operating_pressure = operating_pressure;
	}

	public int getDesign_temperature() {
		return design_temperature;
	}

	public void setDesign_temperature(int design_temperature) {
		this.design_temperature = design_temperature;
	}

	public int getOparating_temperature() {
		return oparating_temperature;
	}

	public void setOparating_temperature(int oparating_temperature) {
		this.oparating_temperature = oparating_temperature;
	}

	
}
