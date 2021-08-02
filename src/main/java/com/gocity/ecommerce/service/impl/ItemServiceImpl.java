package com.gocity.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gocity.ecommerce.domain.Category;
import com.gocity.ecommerce.domain.Item;
import com.gocity.ecommerce.exception.GenericBusinessException;
import com.gocity.ecommerce.mapper.ItemMapper;
import com.gocity.ecommerce.repository.ItemRepository;
import com.gocity.ecommerce.request.ItemRequestDto;
import com.gocity.ecommerce.response.ItemResponseDto;
import com.gocity.ecommerce.service.CategoryService;
import com.gocity.ecommerce.service.ItemService;

/**
 * Service implmentation of @ItemService
 * 
 * @author Tanveer Bulsari
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ItemMapper itemMapper;

	@Autowired
	private CategoryService categoryService;

	@Override
	public ItemResponseDto addItem(ItemRequestDto request) throws GenericBusinessException {
		Category category = categoryService.findById(request.getCategoryId());
		Item item = itemMapper.itemRequestToItemDomain(request, category);
		item = itemRepository.save(item);
		return itemMapper.itemDomainToItemResponse(item);
	}

	@Override
	public Page<ItemResponseDto> findAllProducts(Pageable pageable) {
		Page<Item> items = itemRepository.findAll(pageable);
		return items.map(itemMapper::itemDomainToItemResponse);
	}

}
