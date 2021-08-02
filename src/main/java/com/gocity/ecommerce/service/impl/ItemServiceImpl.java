package com.gocity.ecommerce.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * Service implementation of @ItemService
 * 
 * @author Tanveer Bulsari
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);
	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ItemMapper itemMapper;

	@Autowired
	private CategoryService categoryService;

	@Override
	public ItemResponseDto addItem(ItemRequestDto request) throws GenericBusinessException {
		LOGGER.info("Adding an item with name {} and category {}", request.getName(), request.getCategoryId());
		Category category = categoryService.findById(request.getCategoryId());
		Item item = itemMapper.itemRequestToItemDomain(request, category);
		item = itemRepository.save(item);
		return itemMapper.itemDomainToItemResponse(item);
	}

	@Override
	public Page<ItemResponseDto> findAllProducts(Pageable pageable) {
		Page<Item> items = itemRepository.findAllItems(pageable);
		return items.map(itemMapper::itemDomainToItemResponse);
	}

	@Override
	public void deleteProduct(String itemId) {
		itemRepository.deleteItem(itemId);
		LOGGER.info("Item with {} deleted", itemId);
	}

	@Override
	public ItemResponseDto update(String id, ItemRequestDto request) throws GenericBusinessException {
		Item item = itemRepository.findById(id).orElseThrow(() -> new GenericBusinessException("Item does not exists"));
		item = itemMapper.itemRequestToItemDomain(request, item.getCategory());
		item.setId(id);
		item = itemRepository.save(item);
		LOGGER.info("Item with name {} and category {} update", request.getName(), request.getCategoryId());
		return itemMapper.itemDomainToItemResponse(item);
	}

}
