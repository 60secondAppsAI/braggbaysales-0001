package com.braggbaysales.dao;

import java.util.List;

import com.braggbaysales.dao.GenericDAO;
import com.braggbaysales.domain.CartItem;





public interface CartItemDAO extends GenericDAO<CartItem, Integer> {
  
	List<CartItem> findAll();
	






}


