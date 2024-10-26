package com.braggbaysales.dao;

import java.util.List;

import com.braggbaysales.dao.GenericDAO;
import com.braggbaysales.domain.ShoppingCart;





public interface ShoppingCartDAO extends GenericDAO<ShoppingCart, Integer> {
  
	List<ShoppingCart> findAll();
	






}


