package com.dayi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Article;

import com.dayi.mapper.ArticleMapper;


@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;
	
	
	
	@Override
	public void editArticle(Article article) {
		articleMapper.editArticle(article);
	}

	@Override
	public void deleteArticle(Integer art_id) {
		articleMapper.deleteArticle(art_id);
	}

	@Override
	public void updateArticle(Article article) {
		articleMapper.updateArticle(article);
		
	}

	
	@Override
	public Article getArticle(Integer art_id) {
		return articleMapper.getArticle(art_id);
	}


	@Override
	public List<Article> getAllArticle() {
		return articleMapper.getAllArticle();
	}

	
	
	
	
	

	
	


}
