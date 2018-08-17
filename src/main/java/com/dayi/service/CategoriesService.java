package com.dayi.service;

import java.util.List;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;


public interface CategoriesService {
	
	public Categories getSome(int cate_id);
	
	public List<Categories> getAllCategories();
	
}
