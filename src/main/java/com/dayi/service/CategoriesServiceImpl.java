package com.dayi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;
import com.dayi.mapper.ArticleMapper;
import com.dayi.mapper.CategoriesMapper;


@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesMapper categoriesMapper;
	/*@Autowired
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
	public List<Article> getAllArticle() {
		return articleMapper.getAllArticle();
	}

	@Override
	public Article getArticle(int art_id) {
		return articleMapper.getArticle(art_id);
	}
*/

	@Override
	public Categories getSome(int cate_id) {
		return categoriesMapper.getSome(cate_id);
	}

	@Override
	public List<Categories> getAllCategories() {
		return categoriesMapper.getAllCategories();
	}


	
//	@Override
//	public Article getArticles(int cate_id) {
//		return articleMapper.getArticle(cate_id);
//	}

	
	
	
	
	

	
	


}
