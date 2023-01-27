package com.demo.test.Controller.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.Model.Service.Registration.RegistrationService;

@Controller
public class RegistrationController 
{
	@Autowired
	public RegistrationService ser;
	public RegistrationController()
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ModelAndView userRegistrationController(StudentDTO sdto)
	{
		System.out.println("userRegistrationController started");
		ser.userRegistrationService(sdto);
		System.out.println("userRegistrationController ended");
		return new ModelAndView("/display.jsp");
	}
}
