package com.dayi.service;

import java.util.List;

import com.dayi.entity.Article;


public interface ArticleService {
	public void editArticle(Article article);
	public void deleteArticle(Integer art_id);
	public void updateArticle(Article article);
	
	Article getArticle(Integer art_id);
	List<Article> getAllArticle();
	
}
