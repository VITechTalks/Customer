package com.xyz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer cId;
	
	private String name;
	
	private String addrs;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", addrs=" + addrs + "]";
	}

	public Customer(Integer cId, String name, String addrs) {
		super();
		this.cId = cId;
		this.name = name;
		this.addrs = addrs;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
