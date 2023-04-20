package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info")
public class CML_Entity {

	
	@Column(name = "line_number")
	private String line_number;
	
	@Column(name = "cml_description")
	private String cml_description;
	
	@Id
	@Column(name = "cml_number")
	private int cml_number;
	
	@Column(name = "actual_outside_diameter")
	private float  actual_outside_diameter;
	
	@Column(name = "design_thickness")
	private float  design_thickness;
	
	@Column(name = "structural_thickness")
	private float  structural_thickness;
	
	@Column(name = "required_thickness")
	private float  required_thickness;
	
	public CML_Entity () {}

	public CML_Entity(String line_number, String cml_description, int cml_number, float actual_outside_diameter,
			float design_thickness, float structural_thickness, float required_thickness) {
		super();
		this.line_number = line_number;
		this.cml_description = cml_description;
		this.cml_number = cml_number;
		this.actual_outside_diameter = actual_outside_diameter;
		this.design_thickness = design_thickness;
		this.structural_thickness = structural_thickness;
		this.required_thickness = required_thickness;
	}

	public String getLine_number() {
		return line_number;
	}

	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}

	public String getCml_description() {
		return cml_description;
	}

	public void setCml_description(String cml_description) {
		this.cml_description = cml_description;
	}

	public int getCml_number() {
		return cml_number;
	}

	public void setCml_number(int cml_number) {
		this.cml_number = cml_number;
	}

	public float getActual_outside_diameter() {
		return actual_outside_diameter;
	}

	public void setActual_outside_diameter(float actual_outside_diameter) {
		this.actual_outside_diameter = actual_outside_diameter;
	}

	public float getDesign_thickness() {
		return design_thickness;
	}

	public void setDesign_thickness(float design_thickness) {
		this.design_thickness = design_thickness;
	}

	public float getStructural_thickness() {
		return structural_thickness;
	}

	public void setStructural_thickness(float structural_thickness) {
		this.structural_thickness = structural_thickness;
	}

	public float getRequired_thickness() {
		return required_thickness;
	}

	public void setRequired_thickness(float required_thickness) {
		this.required_thickness = required_thickness;
	}
	
	
}
