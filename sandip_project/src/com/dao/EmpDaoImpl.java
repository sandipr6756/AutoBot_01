package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.LoginModel;
import com.model.EmpModel;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addEmp(EmpModel emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(emp);
	}
	
	
	@Override
	public EmpModel getEmp(int id) {
		// TODO Auto-generated method stub
		EmpModel model = (EmpModel) sessionFactory.getCurrentSession().get(EmpModel.class,id);
		return model;
	}

	@Override
	public List<EmpModel> getEmps() {
		// TODO Auto-generated method stub
		List<EmpModel> list = sessionFactory.getCurrentSession().createQuery("from EmpModel").list();
		return list;
	}

	
	@Override
	public void update(EmpModel emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(emp);
	}

	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		EmpModel model = (EmpModel) sessionFactory.getCurrentSession().get(EmpModel.class,id);
		sessionFactory.getCurrentSession().delete(model);
		
	}

    
	@Override
	public List<EmpModel> doLogin(LoginModel log) {
		// TODO Auto-generated method stub
		String hql = "FROM EmpModel S WHERE S.email = '"+log.getEmail()+"' and S.password='"+log.getPassword()+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<EmpModel> results = query.list();
		List<EmpModel>res = results.size()>0?results:null;
		return res;
	}



}
