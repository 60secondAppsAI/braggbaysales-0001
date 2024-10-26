package com.braggbaysales.dao;

import java.util.List;

import com.braggbaysales.dao.GenericDAO;
import com.braggbaysales.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


