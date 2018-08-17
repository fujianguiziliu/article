package com.dayi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;



@Repository
public interface CategoriesMapper {
//	public void editArticle(Article article);
//	public void deleteArticle(Integer art_id);
//	public void updateArticle(Article article);
//	public Article getArticle(int art_id); 
//	public List<Article> getAllArticle();
	public Categories getSome(int cate_id);
	public List<Categories> getAllCategories();
	
	
}
