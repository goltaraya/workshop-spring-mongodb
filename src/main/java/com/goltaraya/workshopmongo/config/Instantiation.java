package com.goltaraya.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.goltaraya.workshopmongo.domain.Post;
import com.goltaraya.workshopmongo.domain.User;
import com.goltaraya.workshopmongo.dto.AuthorDTO;
import com.goltaraya.workshopmongo.repositories.PostRepository;
import com.goltaraya.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	@Autowired
	PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User u1 = new User(null, "Yago Alexandre", "yago@mail.com");
		User u2 = new User(null, "Ciro Dourado", "ciro@mail.com");
		User u3 = new User(null, "Thiago Gonzalez", "thiago@mail.com");
		User u4 = new User(null, "Cayo Ricardo", "cayo@mail.com");
		User u5 = new User(null, "Gustavo Diniz", "gustavo@mail.com");
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

		Post p1 = new Post(null, sdf.parse("18/06/2023"), "Partiu jogatina!",
				"Vou começar minha jogatina de fim de semana.", new AuthorDTO(u1));
		Post p2 = new Post(null, sdf.parse("20/02/2019"), "Boa noite.", "Tenham todos uma excelente noite!",
				new AuthorDTO(u1));
		postRepository.saveAll(Arrays.asList(p1, p2));
		
		u1.getPosts().addAll(Arrays.asList(p1, p2));
		userRepository.save(u1);
	}
}
