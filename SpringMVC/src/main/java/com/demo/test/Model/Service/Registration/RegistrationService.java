package com.demo.test.Model.Service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.Model.DAO.Registration.RegistrationDAO;

@Service
public class RegistrationService 
{
	@Autowired
	public RegistrationDAO dao;
	public RegistrationService() 
	{
		
			System.out.println(this.getClass().getSimpleName()+" created");
		}
		public void userRegistrationService(StudentDTO stdo)
		{
			System.out.println("userRegistrationService started");
			dao.userRegistrationDAO(stdo);
			System.out.println("userRegistrationService ended");
		}
}
