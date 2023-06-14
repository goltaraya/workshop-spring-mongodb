package com.goltaraya.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goltaraya.workshopmongo.domain.User;
import com.goltaraya.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		List<User> list = repository.findAll();
		return list;
	}
}
