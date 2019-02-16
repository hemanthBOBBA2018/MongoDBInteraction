package com.hemanth.Model;

public class Employer extends User {
	private String empId;
	private String fullname;
	private String location;
	private String mobileno;
	private String contactPerson;
		
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String id) {
		this.empId = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	

}
