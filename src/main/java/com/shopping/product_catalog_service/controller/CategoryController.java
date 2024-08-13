package com.shopping.product_catalog_service.controller;

import com.shopping.product_catalog_service.entity.Category;
import com.shopping.product_catalog_service.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

@PostMapping
public Category createCategory(@RequestBody Category category) {
    return categoryService.saveCategory(category);
}
@PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
    if (categoryService.getCategoryById(id).isPresent()) {
        category.setId(id);
        return categoryService.updateCategory(category);
    } else {
        return null;
    }
}
@DeleteMapping("/id")
public void deleteCategory(@PathVariable Long id){
    categoryService.deleteCategory(id);
}

@GetMapping("/id")
    public Optional<Category> getCategoryById(@PathVariable Long id){
    return categoryService.getCategoryById(id);
}

@GetMapping
public List<Category> getAllCategories(){
    return categoryService.getAllCategories();
}

}
