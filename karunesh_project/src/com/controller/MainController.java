package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.EmpModel;
import com.model.LoginModel;
import com.model.EmpModel;
import com.service.EmpService;
import com.service.EmpService;
import com.service.EmpServiceImpl;

@Controller
public class MainController {
	@Autowired
	EmpService empservice;
	
	@RequestMapping("reg")
	public String getRegForm()
	{
		return "Reg_form";
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String addEmp(@ModelAttribute("emp") EmpModel stdent)
	{
		empservice.addEmp(stdent);
		return "Login";
	}
	
	@RequestMapping("log")
	public String getLogForm()
	{
		return "Login";
	}
	
	@RequestMapping(value="dologin",method=RequestMethod.POST)
	public String doLogin(@ModelAttribute("log") LoginModel log,HttpSession session)
	{
		List<EmpModel> list = empservice.doLogin(log);
		if(list==null) {
			
			return "Login";
		}
		else {
			session.setAttribute("sesuser", log.getEmail());
			return "redirect:/getEmpdetails";
			
		}
		
	}
	
@RequestMapping("getEmpdetails")
public String getEmps(HttpSession session)
{
		List<EmpModel> list = empservice.getEmps();
		session.setAttribute("list", list);
		return "home";
}

@RequestMapping("delete/{id}")

public String deleteEmpById(@PathVariable int id)
{
	empservice.delete(id);
	return "redirect:/getEmpdetails";
}


@RequestMapping("edit/{id}")

public String getEmpById(@PathVariable int id,HttpSession session)
{
	EmpModel model = empservice.getEmp(id);
	session.setAttribute("emp", model);
	return "editemp";
}

@RequestMapping(value="update",method=RequestMethod.POST)
public String updateEmp(@ModelAttribute("emp") EmpModel  emp) {
		empservice.update(emp);
	return "redirect:/getEmpdetails";
}
}
