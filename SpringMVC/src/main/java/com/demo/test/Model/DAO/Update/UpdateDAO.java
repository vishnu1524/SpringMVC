package com.demo.test.Model.DAO.Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.DTO.Update.UpdateDTO;

public class UpdateDAO {
	@Autowired
	private SessionFactory fact;
	public void userRegistrationDAO(StudentDTO stdo)
	{
		System.out.println("userUpdationDAO started");
		Session session= fact.openSession();
		Transaction tx= session.beginTransaction();
		try {
			UpdateDTO fromdb=session.get(UpdateDTO.class);
			if(fromdb!=null)
			{
				session.update(fromdb);
				tx.commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		session.close();
		System.out.println("userUpdationDAO ended");
	}
}
