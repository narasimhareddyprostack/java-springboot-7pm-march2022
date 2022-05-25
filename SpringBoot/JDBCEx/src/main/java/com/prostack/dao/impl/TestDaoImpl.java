package com.prostack.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prostack.dao.ITestDao;

@Repository
public class TestDaoImpl implements ITestDao{
	
@Autowired
JdbcTemplate jt;
	@Override
	public void insertRecords() {
		jt.update("insert into emp values(101, 'Rahul Gandhi', 45000)");
		jt.update("insert into emp values(102, 'Priyanka Gandhi', 55000)");
		jt.update("insert into emp values(103, 'Sonia Gandhi', 65000)");
		jt.update("insert into emp values(104, 'Modi ', 95000)");
	}

	@Override
	public List selectRecords() {
		return jt.queryForList("select * from emp");
	}

	@Override
	public int noOfEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}


}
