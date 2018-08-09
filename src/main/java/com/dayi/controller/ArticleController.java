package com.dayi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dayi.entity.Article;

import com.dayi.service.ArticleService;

import com.google.gson.Gson;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	
	@RequestMapping("edit")
	public void editArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
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
        article.setArt_id(art_id);
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
		/* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        articleService.deleteArticle(61);
	}
	
	@RequestMapping("update")
	public void updateArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Article article = new Article();
        article.setArt_content("������8��9�յ� ����ʱ��8���賿������֥�Ӹ緢������ǹ���¼��������������������һ��Ů�Ա�����ͷ����������Σ�������Ѿ�����6�췢������ǹ�������������13������������70�����ˡ�");
        article.setArt_id("110");
        article.setArt_intro("C:/Users/Administrator/Desktop/new.jpg");
        article.setArt_tags("�����ȱ�");
        article.setArt_title("����֥�Ӹ緢������ǹ���¼�");
        article.setCopy_url("http://news.163.com/18/0809/11/DOOUNCQ80001875O.html");
        articleService.updateArticle(article);
	}
	
	@RequestMapping("getArticle")
	public void getArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Article article = articleService.getArticle(110);
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(article));
	}
	
	@RequestMapping("getAllArticle")
	public void getAllArticle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* ������Ӧͷ����ajax������� */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        List<Article> allArticle = articleService.getAllArticle();
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(allArticle));
		
	}
	

}
