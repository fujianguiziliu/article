package com.dayi.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dayi.entity.Article;
import com.dayi.entity.Categories;
import com.dayi.mapper.CategoriesMapper;
import com.dayi.service.ArticleService;
import com.dayi.service.CategoriesService;
import com.google.gson.Gson;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@Autowired
	CategoriesService categoriesService;
	

	
	@RequestMapping("edit")
	public void editArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        String art_id = request.getParameter("art_id");
        String art_title = request.getParameter("art_title");
    
        String art_tags = request.getParameter("art_tags");
        String art_pic = request.getParameter("art_pic");
        String art_intro = request.getParameter("art_intro");
        String copy_url = request.getParameter("copy_url");
        String art_content = request.getParameter("art_content");
        
        Article article = new Article();
        article.setArt_content(art_content);
       article.setArt_id("3184");
        article.setArt_intro(art_intro);
        article.setArt_pic(art_pic);
        article.setArt_tags(art_tags);
        article.setArt_title(art_title);
        article.setCopy_url(copy_url);
        articleService.editArticle(article);
		
	}
	
	@RequestMapping("delete")
	public void deleteArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        articleService.deleteArticle(110);
	}
	
	@RequestMapping("update")
	public void updateArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Article article = new Article();
        article.setArt_content("海外网8月9日电 当地时间8日凌晨，美国芝加哥发生两起枪击事件，造成两人死亡，还有一名女性被击中头部，生命垂危。该市已经连续6天发生多起枪击案，造成至少13人死亡，超过70人受伤。");
        article.setArt_id("110");
        article.setArt_intro("C:/Users/Administrator/Desktop/new.jpg");
        article.setArt_tags("新闻热报");
        article.setArt_title("美国芝加哥发生两起枪击事件");
        article.setCopy_url("http://news.163.com/18/0809/11/DOOUNCQ80001875O.html");
        article.setArt_pic("1223");
        articleService.updateArticle(article);
	}
	
	@RequestMapping("getArticle")
	public void getArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Article article = articleService.getArticle(3184);
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(article));
	}
	
	@RequestMapping("getAllArticle")
	public void getAllArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        List<Article> allArticle = articleService.getAllArticle();
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(allArticle));
		
	}
	@RequestMapping("getSome")
	public void getSome(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String cate_id = request.getParameter("cate_id");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Categories some = categoriesService.getSome(Integer.valueOf(cate_id));
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(some));
	}
	
	/*@RequestMapping("get_cateid")
	public void get_cateid(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		 设置响应头允许ajax跨域访问   
        response.setHeader("Access-Control-Allow-Origin", "*");  
         星号表示所有的异域请求都可以接受，   
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
       
		Article some = articleService.get_cateid(article);
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(some));
		
	}*/
	
	@RequestMapping("getclassify")
	public void getClassify(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Categories> allCategories = categoriesService.getAllCategories();
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(allCategories));
	}

	@RequestMapping("getcontentortitle")
	public void get_ContentOrTitle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	
       String cate_id = request.getParameter("cate_id");
       List<Article> get_ContentOrTitle = articleService.get_ContentOrTitle(cate_id);
       Gson gson = new Gson();
       response.getWriter().write(gson.toJson(get_ContentOrTitle));
		//Article article= new Article();
//		article.setArt_content(art_content);
//		article.setArt_id(art_id);
//		article.setArt_pic(art_pic);
//		article.setArt_title(art_title);
//		List<Article> get_ContentOrTitle = articleService.get_ContentOrTitle("cate_id");
//		Gson gson = new Gson();
				
		
	}
	@RequestMapping("get_content")
	public void getContent(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String art_id = request.getParameter("art_id");
		Article content = articleService.getContent(art_id);
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(content));
	}
	
	
}
