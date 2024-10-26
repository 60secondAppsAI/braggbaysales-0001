package com.braggbaysales.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddressPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<AddressDTO> addresss;
}





