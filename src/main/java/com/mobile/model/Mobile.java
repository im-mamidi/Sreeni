package com.mobile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String mobile_name;
	private String mobile_model;
	private String mobile_cost;

	public Mobile() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public String getMobile_model() {
		return mobile_model;
	}

	public void setMobile_model(String mobile_model) {
		this.mobile_model = mobile_model;
	}

	public String getMobile_cost() {
		return mobile_cost;
	}

	public void setMobile_cost(String mobile_cost) {
		this.mobile_cost = mobile_cost;
	}

	public Mobile(Long id, String mobile_name, String mobile_model, String mobile_cost) {
		super();
		this.id = id;
		this.mobile_name = mobile_name;
		this.mobile_model = mobile_model;
		this.mobile_cost = mobile_cost;
	}

}
