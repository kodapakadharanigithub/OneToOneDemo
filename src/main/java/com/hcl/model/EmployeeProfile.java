package com.hcl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeProfile {
	@Id
	private int id;
	private String area,city;
	private long phone;
	public EmployeeProfile()
	{
		
	}
	public EmployeeProfile(int id, String area, String city, long phone) {
		super();
		this.id = id;
		this.area = area;
		this.city = city;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "EmployeeProfile [id=" + id + ", area=" + area + ", city=" + city + ", phone=" + phone + "]";
	}
	
	

}
