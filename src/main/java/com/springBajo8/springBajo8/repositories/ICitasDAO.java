package com.springBajo8.springBajo8.repositories;

import com.springBajo8.springBajo8.models.CitasDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitasDAO extends MongoRepository<CitasDTO, String> {
	
	
}
