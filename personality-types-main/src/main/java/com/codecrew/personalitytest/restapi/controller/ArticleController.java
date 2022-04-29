package com.codecrew.personalitytest.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecrew.personalitytest.restapi.dao.ArticleRepository;
import com.codecrew.personalitytest.restapi.model.Article;


@RestController
@RequestMapping(value = "/api/articles/")
public class ArticleController {
	
	private ArticleRepository articleRepository;
	
	@Autowired
	public ArticleController(ArticleRepository articleRepository) {
               super();
	       this.articleRepository = articleRepository;
	}

	@GetMapping("all")
        public ResponseEntity<List<Article>> getAll(){
               var articles = articleRepository.getAll();
               return ResponseEntity.ok(articles);
        }
	
	@PostMapping("add")
	public ResponseEntity<Article> add(@Valid @RequestBody Article article) {
	       articleRepository.save(article);
	       return ResponseEntity.ok(article);
	}
	

}
