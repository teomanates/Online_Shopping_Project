package com.shopping.product_catalog_service.repository;

import com.shopping.product_catalog_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
