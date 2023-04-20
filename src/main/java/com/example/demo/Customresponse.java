package com.example.demo;

public class Customresponse {

	private Boolean success;
	private Object  message;
	
	public Customresponse() {}

	public Customresponse(Boolean success, Object message) {
		super();
		this.success = success;
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	
}
