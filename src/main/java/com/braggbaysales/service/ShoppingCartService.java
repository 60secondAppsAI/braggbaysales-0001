package com.braggbaysales.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbaysales.domain.ShoppingCart;
import com.braggbaysales.dto.ShoppingCartDTO;
import com.braggbaysales.dto.ShoppingCartSearchDTO;
import com.braggbaysales.dto.ShoppingCartPageDTO;
import com.braggbaysales.dto.ShoppingCartConvertCriteriaDTO;
import com.braggbaysales.service.GenericService;
import com.braggbaysales.dto.common.RequestDTO;
import com.braggbaysales.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ShoppingCartService extends GenericService<ShoppingCart, Integer> {

	List<ShoppingCart> findAll();

	ResultDTO addShoppingCart(ShoppingCartDTO shoppingCartDTO, RequestDTO requestDTO);

	ResultDTO updateShoppingCart(ShoppingCartDTO shoppingCartDTO, RequestDTO requestDTO);

    Page<ShoppingCart> getAllShoppingCarts(Pageable pageable);

    Page<ShoppingCart> getAllShoppingCarts(Specification<ShoppingCart> spec, Pageable pageable);

	ResponseEntity<ShoppingCartPageDTO> getShoppingCarts(ShoppingCartSearchDTO shoppingCartSearchDTO);
	
	List<ShoppingCartDTO> convertShoppingCartsToShoppingCartDTOs(List<ShoppingCart> shoppingCarts, ShoppingCartConvertCriteriaDTO convertCriteria);

	ShoppingCartDTO getShoppingCartDTOById(Integer shoppingCartId);







}





