package com.codecrew.personalitytest.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Article {
	
    	@Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "article_id")
	    private int id;
    	
	    @Column(name = "text", columnDefinition = "LONGTEXT")
	    private String text;
	    private String titleText;
	    private List<Article> articles;
}
