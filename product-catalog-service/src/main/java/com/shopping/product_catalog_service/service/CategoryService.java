package com.shopping.product_catalog_service.service;

import com.shopping.product_catalog_service.entity.Category;
import com.shopping.product_catalog_service.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

public List<Category> getAllCategories() {
    return categoryRepository.findAll();
}
public Optional<Category> getCategoryById(Long id) {
    return categoryRepository.findById(id);

}
public Category saveCategory(Category category) {
    return categoryRepository.save(category);
}
public Category updateCategory(Category category) {
    return categoryRepository.save(category);
}
public void deleteCategory(Long id) {
    categoryRepository.deleteById(id);
}

}
