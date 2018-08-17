package com.dayi.service;

import java.util.List;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;


public interface ArticleService {
	public void editArticle(Article article);
	public void deleteArticle(Integer art_id);
	public void updateArticle(Article article);
	
	
	List<Article> getAllArticle();
	Article getArticle(int art_id);
	public List<Article> get_ContentOrTitle(String cate_id);
	
	public Article getContent(String art_id);
}
