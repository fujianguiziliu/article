package com.dayi.mapper;

import java.util.List;

import org.apache.ibatis.scripting.xmltags.WhereSqlNode;
import org.springframework.stereotype.Repository;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;



@Repository
public interface ArticleMapper {
	public void editArticle(Article article);
	public void deleteArticle(Integer art_id);
	public void updateArticle(Article article);
	public Article getArticle(int art_id); 
	public List<Article> getAllArticle();
	public Article get_cateid(Article article); 
	
	public List<Article> get_ContentOrTitle(String cate_id);
	
	public Article getContent(String art_id);
	/*where param1="1"and canshu2=#{param2}*/
}
