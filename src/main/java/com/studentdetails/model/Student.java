package com.studentdetails.model;

public class Student {
	private String ADMNO;
	private String Full_Name;
	private String USN;
	private String Father_Name;
	private String Email;
	private String Phone;
	private String B_date;
	private String Date_Join;
	private String Address;
	private String Branch;
	private String sql;
	
	
	
	public String getADMNO() {
		return ADMNO;
	}
	public void setADMNO(String aDMNO) {
		ADMNO = aDMNO;
	}
	public String getFull_Name() {
		return Full_Name;
	}
	public void setFull_Name(String full_Name) {
		Full_Name = full_Name;
	}
	public String getFather_Name() {
		return Father_Name;
	}
	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getB_date() {
		return B_date;
	}
	public void setB_date(String b_date) {
		B_date = b_date;
	}
	public String getDate_Join() {
		return Date_Join;
	}
	public void setDate_Join(String date_Join) {
		Date_Join = date_Join;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [USN=" + USN + ", Student Name=" + Full_Name + ",Father's Name="+Father_Name+"]";
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}

}
