package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "thickness")
public class TN_Entity {

	@Id
	@Column(name = "line_number")
	private String line_number;
	
	@Column(name = "inspection_date")
	private Date inspection_date;
	
	@Column(name = "tp_number")
	private int tp_number;
	
	@Column(name = "cml_number")
	private int cml_number;
	
	@Column(name = "actual_thickness")
	private int actual_thickness;
	
	@Column(name = "thickness_number")
	private int thickness_number;
	
	public TN_Entity () {}

	public TN_Entity(String line_number, Date inspection_date, int tp_number, int cml_number, int actual_thickness,
			int thickness_number) {
		super();
		this.line_number = line_number;
		this.inspection_date = inspection_date;
		this.tp_number = tp_number;
		this.cml_number = cml_number;
		this.actual_thickness = actual_thickness;
		this.thickness_number = thickness_number;
	}

	public String getLine_number() {
		return line_number;
	}

	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}

	public Date getInspection_date() {
		return inspection_date;
	}

	public void setInspection_date(Date inspection_date) {
		this.inspection_date = inspection_date;
	}

	public int getTp_number() {
		return tp_number;
	}

	public void setTp_number(int tp_number) {
		this.tp_number = tp_number;
	}

	public int getCml_number() {
		return cml_number;
	}

	public void setCml_number(int cml_number) {
		this.cml_number = cml_number;
	}

	public int getActual_thickness() {
		return actual_thickness;
	}

	public void setActual_thickness(int actual_thickness) {
		this.actual_thickness = actual_thickness;
	}

	public int getThickness_number() {
		return thickness_number;
	}

	public void setThickness_number(int thickness_number) {
		this.thickness_number = thickness_number;
	}

	
}
