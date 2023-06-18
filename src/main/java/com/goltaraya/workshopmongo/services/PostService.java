package com.goltaraya.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goltaraya.workshopmongo.domain.Post;
import com.goltaraya.workshopmongo.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.get();
	}
}
