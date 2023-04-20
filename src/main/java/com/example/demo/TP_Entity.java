package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_point")
public class TP_Entity {

	@Id
	@Column(name = "line_number")
	private String line_number;
	
	@Column(name = "tp_number")
	private int tp_number;
	
	@Column(name = "tp_description")
	private int tp_description;
	
	@Column(name = "cml_number")
	private int cml_number;
	
	@Column(name = "note")
	private String note;
	
	public TP_Entity() {}

	public TP_Entity(String line_number, int tp_number, int tp_description, int cml_number, String note) {
		super();
		this.line_number = line_number;
		this.tp_number = tp_number;
		this.tp_description = tp_description;
		this.cml_number = cml_number;
		this.note = note;
	}

	public String getLine_number() {
		return line_number;
	}

	public void setLine_number(String line_number) {
		this.line_number = line_number;
	}

	public int getTp_number() {
		return tp_number;
	}

	public void setTp_number(int tp_number) {
		this.tp_number = tp_number;
	}

	public int getTp_description() {
		return tp_description;
	}

	public void setTp_description(int tp_description) {
		this.tp_description = tp_description;
	}

	public int getCml_number() {
		return cml_number;
	}

	public void setCml_number(int cml_number) {
		this.cml_number = cml_number;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
}
