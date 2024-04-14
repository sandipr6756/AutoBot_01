package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmpDao;
import com.dao.EmpDaoImpl;
import com.model.LoginModel;
import com.model.EmpModel;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao dao;
	@Transactional
	@Override
	public void addEmp(EmpModel emp) {
		// TODO Auto-generated method stub
		dao.addEmp(emp);

	}
	@Transactional
	@Override
	public EmpModel getEmp(int id) {
		// TODO Auto-generated method stub
		EmpModel emp = dao.getEmp(id);
		return emp;
	}
	@Transactional
	@Override
	public List<EmpModel> getEmps() {
		// TODO Auto-generated method stub
		List<EmpModel> list = dao.getEmps();
		return list;
	}
	@Transactional
	@Override
	public void update(EmpModel emp) {
		// TODO Auto-generated method stub
		dao.update(emp);
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
	@Transactional
	@Override
	public List<EmpModel> doLogin(LoginModel log) {
		// TODO Auto-generated method stub
		List<EmpModel> list = dao.doLogin(log);
		return list;
	}

}
