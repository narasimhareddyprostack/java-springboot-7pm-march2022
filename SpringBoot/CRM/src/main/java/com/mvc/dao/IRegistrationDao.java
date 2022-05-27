package com.mvc.dao;

import com.mvc.model.CustomerBean;

public interface IRegistrationDao {
	public boolean saveCustomer(CustomerBean customerBean);
}
