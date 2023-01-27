package com.demo.test.Model.Service.Update;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.Model.DAO.Registration.RegistrationDAO;

public class UpdateService {
	@Autowired
	public RegistrationDAO dao;
	public UpdateService() 
	{
		
			System.out.println(this.getClass().getSimpleName()+" created");
		}
		public void userRegistrationService(StudentDTO stdo)
		{
			System.out.println("userUpdationtionService started");
			dao.userRegistrationDAO(stdo);
			System.out.println("userUpdationService ended");
		}

}
