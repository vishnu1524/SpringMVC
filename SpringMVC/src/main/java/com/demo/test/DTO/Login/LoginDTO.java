package com.demo.test.DTO.Login;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class LoginDTO implements Serializable
{
	private String email;
	private String pwd;
	
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", pwd=" + pwd + "]";
	}
	
}
