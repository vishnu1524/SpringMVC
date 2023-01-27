package com.demo.test.DTO.Registrartion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stud_details")
public class StudentDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	
	private int id;
	@Column(name="student_name")
	private String name;
	@Column(name="student_address")
	private String address;
	@Column(name="course")
	private String course;
	@Column(name="student_place")
	private String place;
	@Column(name="student_age")
	private int age;
	public StudentDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", place="
				+ place + ", age=" + age + "]";
	}
	
}
