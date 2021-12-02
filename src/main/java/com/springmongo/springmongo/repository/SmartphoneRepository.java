package com.springmongo.springmongo.repository;


import com.springmongo.springmongo.model.Smartphone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SmartphoneRepository extends MongoRepository<Smartphone, Integer> {

}
