package com.codecrew.personalitytest.restapi.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecrew.personalitytest.restapi.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	Optional<Article> add(@Valid Article article);
	List<Article> getAll();
	

}
