package com.shopping.product_catalog_service.controller;

import com.shopping.product_catalog_service.entity.Product;
import com.shopping.product_catalog_service.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;


@PostMapping
public Product addProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
}

@PutMapping("/{id}")
public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
   Optional<Product> existProduct = productService.getProductById(id);
   if(existProduct.isPresent()) {
       product.setId(id);
       return productService.updateProduct(product);
   }else{
       return null;
   }
}

@DeleteMapping("/{id}")
public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
}


@GetMapping("/category/{categoryId}")
public List<Product> getProductsByCategory(@PathVariable Long categoryId) {
return productService.getProductsByCategory(categoryId);
}

@GetMapping
public List<Product> getProducts() {
    return productService.getAllProducts();
}
}
