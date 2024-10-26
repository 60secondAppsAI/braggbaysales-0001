package com.braggbaysales.dao;

import java.util.List;

import com.braggbaysales.dao.GenericDAO;
import com.braggbaysales.domain.Address;





public interface AddressDAO extends GenericDAO<Address, Integer> {
  
	List<Address> findAll();
	






}


