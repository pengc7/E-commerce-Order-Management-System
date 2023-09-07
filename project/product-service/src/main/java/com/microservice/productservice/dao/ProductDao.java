package com.microservice.productservice.dao;

import com.microservice.productservice.beans.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDao extends MongoRepository<Product, String> {

}
