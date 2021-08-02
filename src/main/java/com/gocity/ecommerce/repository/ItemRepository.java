package com.gocity.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gocity.ecommerce.domain.Item;

/**
 * Repository for @Item domain related queries
 * 
 * @author Tanveer Bulsari
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

	Optional<Item> findByName(@Param(value = "name") String name);
}
