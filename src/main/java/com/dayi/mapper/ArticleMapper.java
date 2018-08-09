package com.dayi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Article;



@Repository
public interface ArticleMapper {
	public void editArticle(Article article);
	public void deleteArticle(Integer art_id);
	public void updateArticle(Article article);
	public Article getArticle(Integer art_id); 
	public List<Article> getAllArticle();
	

}
