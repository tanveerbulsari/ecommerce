package com.gocity.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gocity.ecommerce.domain.Category;

/**
 * Repository for @Category domain related queries
 * 
 * @author Tanveer Bulsari
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

	Optional<Category> findById(@Param(value = "id") String id);
}
