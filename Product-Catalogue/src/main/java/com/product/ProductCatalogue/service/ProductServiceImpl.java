package com.product.ProductCatalogue.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ProductCatalogue.model.Product;
import com.product.ProductCatalogue.model.Rating;
import com.product.ProductCatalogue.respository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> searchProducts(Map<String, Object> filters) {
        // Implement search logic based on filters
        // Example: productRepository.findByCategoryAndNameAndAttributes(filters.get("category"), filters.get("name"), filters.get("attributes"));
        return null;
    }

    @Override
    public List<Product> getAllProducts(int page, int size, String sortBy) {
        // Implement pagination and sorting logic
        // Example: Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        // return productRepository.findAll(pageable).getContent();
        return null;
    }

    @Override
    public void rateProduct(String productId, Rating rating) {
        Product product = getProductById(productId);
        if (product != null) {
            product.getRatings().add(rating);
            productRepository.save(product);
        }
    }
}