package com.goltaraya.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.goltaraya.workshopmongo.domain.User;
import com.goltaraya.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();

		User u1 = new User(null, "Yago Alexandre", "yago@mail.com");
		User u2 = new User(null, "Ciro Dourado", "ciro@mail.com");
		User u3 = new User(null, "Thiago Gonzalez", "thiago@mail.com");
		User u4 = new User(null, "Cayo Ricardo", "cayo@mail.com");
		User u5 = new User(null, "Gustavo Diniz", "gustavo@mail.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
	}

}
