package com.product.ProductCatalogue.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductCatalogue.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>
{
   
}