package com.braggbaysales.dao;

import java.util.List;

import com.braggbaysales.dao.GenericDAO;
import com.braggbaysales.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


