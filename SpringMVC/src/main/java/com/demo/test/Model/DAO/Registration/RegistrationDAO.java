package com.demo.test.Model.DAO.Registration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registrartion.StudentDTO;

@Repository
public class RegistrationDAO 
{
	@Autowired
	private SessionFactory fact;
	public RegistrationDAO() 
	{	
			System.out.println(this.getClass().getSimpleName()+" created");
	}
	public void userRegistrationDAO(StudentDTO stdo)
	{
		System.out.println("userRegistrationDAO started");
		Session session= fact.openSession();
		Transaction tx= session.beginTransaction();
		session.save(stdo);
		tx.commit();
		System.out.println("userRegistrationDAO ended");
	}
}
