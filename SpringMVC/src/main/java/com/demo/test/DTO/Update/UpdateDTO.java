package com.demo.test.DTO.Update;

import java.io.Serializable;

import javax.persistence.Column;

public class UpdateDTO implements Serializable{
	@Column(name="student_name")
	private String uname;
	@Column(name="student_address")
	private String uaddress;
	@Column(name="course")
	private String course;
	@Column(name="student_place")
	private String uplace;
	@Column(name="student_age")
	private int uage;
	public UpdateDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getUplace() {
		return uplace;
	}
	public void setUplace(String uplace) {
		this.uplace = uplace;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	@Override
	public String toString() {
		return "UpdateDTO [uname=" + uname + ", uaddress=" + uaddress + ", course=" + course + ", uplace=" + uplace
				+ ", uage=" + uage + "]";
	}
	

}
