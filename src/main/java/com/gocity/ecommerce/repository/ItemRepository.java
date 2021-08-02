package com.gocity.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gocity.ecommerce.domain.Item;

/**
 * Repository for @Item domain related queries
 * 
 * @author Tanveer Bulsari
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
	/**
	 * Finding item by name
	 * 
	 * @param name
	 * @return
	 */
	Optional<Item> findByName(@Param(value = "name") String name);

	/**
	 * 
	 * @param pageable
	 * @return
	 */

	@Query("from Item item where item.isDeleted = 0")
	Page<Item> findAllItems(Pageable pageable);

	@Transactional
	@Modifying
	@Query("update Item item set item.isDeleted = 1 where item.id= ?1")
	int deleteItem(String id);
}
