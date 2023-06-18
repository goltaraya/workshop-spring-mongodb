package com.goltaraya.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.goltaraya.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
