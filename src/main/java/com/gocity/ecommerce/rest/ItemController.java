package com.gocity.ecommerce.rest;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gocity.ecommerce.request.ItemRequestDto;
import com.gocity.ecommerce.response.ApiResponse;
import com.gocity.ecommerce.response.ItemResponseDto;
import com.gocity.ecommerce.service.ItemService;

/**
 * REST Controller to perform any actions related to @Item
 * 
 * @author Tanveer Bulsari
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/item")
public class ItemController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	/**
	 * REST service for user registration
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/add")
	public ApiResponse<ItemResponseDto> addItem(@Valid @RequestBody ItemRequestDto request) throws Exception {
		LOGGER.info("REST service for adding item with name {} called", request.getName());
		return new ApiResponse<ItemResponseDto>(itemService.addItem(request), HttpStatus.OK.value(),
				"Item Added successfully");
	}

	/**
	 * REST service for fetching all products
	 * 
	 * @param pageable
	 * @return
	 */
	@GetMapping("/findAll")
	public ApiResponse<Page<ItemResponseDto>> findAllProducts(Pageable pageable) {
		LOGGER.info("REST service for fetching all products called");
		return new ApiResponse<Page<ItemResponseDto>>(itemService.findAllProducts(pageable), HttpStatus.OK.value(),
				"Item Fetched successfully");
	}

	/**
	 * REST service to delete a product
	 * 
	 * @param pageable
	 * @return
	 */
	@DeleteMapping("/delete")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@RequestParam String itemId) {
		LOGGER.info("REST service for fetching all products called");
		itemService.deleteProduct(itemId);
	}

	/**
	 * REST service for user registration
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@PutMapping("/update/{itemId}")
	public ApiResponse<ItemResponseDto> updateItem(@PathVariable("itemId") String itemId,
			@Valid @RequestBody ItemRequestDto request) throws Exception {
		LOGGER.info("REST service for adding item with name {} called", request.getName());
		return new ApiResponse<ItemResponseDto>(itemService.update(itemId, request), HttpStatus.OK.value(),
				"Item Updated successfully");
	}
}
