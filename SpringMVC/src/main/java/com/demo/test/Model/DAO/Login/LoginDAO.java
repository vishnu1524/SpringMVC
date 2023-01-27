package com.demo.test.Model.DAO.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registrartion.StudentDTO;
@Repository
public class LoginDAO 
{
	@Autowired
	private SessionFactory fact;
	public LoginDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");	
	}
	public StudentDTO userLoginDAO(LoginDTO dto)
	{
		System.out.println("userLoginDAO started");
		Session session=fact.openSession();
		Query qry=session.createQuery("from StudentDTO dto where dto.email='"+dto.getEmail()+"' and dto.pwd='"+dto.getPwd()+"'");
		StudentDTO fromdb=(StudentDTO) qry.uniqueResult();
		System.out.println("userLoginDAO ended");
		return fromdb;
	}
}
