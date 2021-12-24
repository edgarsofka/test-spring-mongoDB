package com.springBajo8.springBajo8.repositories;

import com.springBajo8.springBajo8.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}
