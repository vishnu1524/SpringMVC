package com.demo.test.Controller.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.Model.Service.Update.UpdateService;

public class UpdateController {
	@Autowired
	public UpdateService serv;
	public UpdateController()
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public ModelAndView userRegistrationController(StudentDTO sdto)
	{
		System.out.println("userUpdationController started");
		serv.userRegistrationService(sdto);
		System.out.println("userUpdationController ended");
		return new ModelAndView("/display.jsp");
	}
}
