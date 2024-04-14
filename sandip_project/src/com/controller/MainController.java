package com.controller;



import javax.servlet.http.HttpSession;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.model.EmpModel;
import com.service.EmpService;

@Controller
public class MainController {
	@Autowired
	EmpService empservice;
	
	@RequestMapping("reg")
	public String getRegForm()
	{
		return "Reg_form";
	}
	
	
	@RequestMapping("log")
	public String getLogForm()
	{
		return "Login";
	}
	
	@RequestMapping("sub")
	public String getSubmit()
	{
		return "editemp1";
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
	return "editemp1";
}

@RequestMapping(value="update",method=RequestMethod.POST)
public String updateEmp(@ModelAttribute("emp") EmpModel  emp) {
		empservice.update(emp);
	return "redirect:/getEmpdetails";
}



}
