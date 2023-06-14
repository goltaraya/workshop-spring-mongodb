package com.goltaraya.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.goltaraya.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
