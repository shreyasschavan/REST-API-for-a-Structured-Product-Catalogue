package com.product.ProductCatalogue.service;

import java.util.List;
import java.util.Map;

import com.product.ProductCatalogue.model.Product;
import com.product.ProductCatalogue.model.Rating;


public interface ProductService 
{
	Product addProduct(Product product);
    Product getProductById(String id);
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
    List<Product> searchProducts(Map<String, Object> filters);
    List<Product> getAllProducts(int page, int size, String sortBy);
    void rateProduct(String productId, Rating rating);


}
