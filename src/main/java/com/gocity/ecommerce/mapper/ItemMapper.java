package com.gocity.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.gocity.ecommerce.domain.Category;
import com.gocity.ecommerce.domain.Item;
import com.gocity.ecommerce.request.ItemRequestDto;
import com.gocity.ecommerce.response.ItemResponseDto;

/**
 * 
 * Mapper class for @Item
 * 
 * @author Tanveer Bulsari
 *
 */
@Mapper(componentModel = "spring")
public interface ItemMapper {
	@Mapping(source = "request.name", target = "name")
	@Mapping(source = "request.categoryId", target = "category.id")
	@Mapping(ignore = true, target = "id")
	public Item itemRequestToItemDomain(ItemRequestDto request, Category category);

	public ItemResponseDto itemDomainToItemResponse(Item item);
}
