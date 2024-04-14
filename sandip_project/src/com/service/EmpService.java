package com.service;

import java.util.List;

import com.model.LoginModel;
import com.model.EmpModel;

public interface EmpService {
	public void addEmp(EmpModel student);
	public EmpModel getEmp(int id);
	public List<EmpModel> getEmps();
	public void update(EmpModel emp);
	public void delete(int id);
	public List<EmpModel> doLogin(LoginModel log);
}
