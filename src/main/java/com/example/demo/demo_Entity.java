package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_point")
public class demo_Entity {

	@Id
	@Column(name = "tp_number")
	private Integer tp_number;
	
	@Column(name = "note")
	private String note;
	
	public demo_Entity() {}

	public demo_Entity(Integer tp_number, String note) {
		super();
		this.tp_number = tp_number;
		this.note = note;
	}

	public Integer getTp_number() {
		return tp_number;
	}

	public void setTp_number(Integer tp_number) {
		this.tp_number = tp_number;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
