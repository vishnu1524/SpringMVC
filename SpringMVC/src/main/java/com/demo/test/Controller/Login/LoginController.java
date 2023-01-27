package com.demo.test.Controller.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registrartion.StudentDTO;
import com.demo.test.Model.Service.Login.LoginService;
@Controller
public class LoginController 
{
	@Autowired
	private LoginService service;
	
	HttpSession session;
	public LoginController() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value="/login.do",method = RequestMethod.POST)
	public ModelAndView userLoginController(LoginDTO dto,HttpServletRequest req)
	{
		System.out.println("userLoginController started");
		StudentDTO fromdb=service.userLoginService(dto);
		if(fromdb!=null)
		{
			session=req.getSession();
			session.setAttribute("student", fromdb);
			return new ModelAndView("/home.jsp","ts",fromdb.getName());
		}
		else
		{
			return new ModelAndView("/login.jsp");
		}
	}
}
