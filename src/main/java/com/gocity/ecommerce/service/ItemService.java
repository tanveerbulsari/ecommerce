package com.gocity.ecommerce.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gocity.ecommerce.exception.GenericBusinessException;
import com.gocity.ecommerce.request.ItemRequestDto;
import com.gocity.ecommerce.response.ItemResponseDto;

/**
 * Item service for inserting/updating/viewing products
 * 
 * @author Tanveer Bulsari
 *
 */

@Service
public interface ItemService {
	/**
	 * Service method to add an @Item
	 * 
	 * @param request
	 * @return
	 */
	public ItemResponseDto addItem(ItemRequestDto request) throws GenericBusinessException;

	public Page<ItemResponseDto> findAllProducts(Pageable pageable);
}
