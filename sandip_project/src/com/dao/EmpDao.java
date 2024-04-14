package com.dao;

import java.util.List;

import com.model.LoginModel;
import com.model.EmpModel;

public interface EmpDao {
	public void addEmp(EmpModel emp);
	public EmpModel getEmp(int id);
	public List<EmpModel> getEmps();
	public void update(EmpModel emp);
	public void delete(int id);
	public List<EmpModel> doLogin(LoginModel log);
}
