package com.hcl.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="fname")
	private String firstName;
	@Column(name="lname")
	private String lastName;
	@Column(nullable=false,unique=true)
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="profile_id")
	private EmployeeProfile empProfile;
	
	public Employee(int id, String firstName, String lastName, String email, EmployeeProfile empProfile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.empProfile = empProfile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmployeeProfile getEmpProfile() {
		return empProfile;
	}
	public void setEmpProfile(EmployeeProfile empProfile) {
		this.empProfile = empProfile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", empProfile=" + empProfile + "]";
	}
	
	
	
	

}
