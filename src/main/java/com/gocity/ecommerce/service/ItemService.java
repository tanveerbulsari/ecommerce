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

	/**
	 * Service method to find all products
	 * 
	 * @param pageable
	 * @return
	 */
	public Page<ItemResponseDto> findAllProducts(Pageable pageable);

	/**
	 * Service method to delete a product
	 */

	public void deleteProduct(String itemId);

	/**
	 * Service method to update an @Item
	 * 
	 * @param request
	 * @return
	 */
	public ItemResponseDto update(String id, ItemRequestDto request) throws GenericBusinessException;

}
