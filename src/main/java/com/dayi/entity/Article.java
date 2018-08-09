package com.dayi.entity;

public class Article {
	private String art_id;
	private String art_title;
	private String art_tags;
	private String art_pic;
	private String art_intro;
	private String copy_url;
	private String art_content;
	
	
	
	public String getArt_id() {
		return art_id;
	}


	public void setArt_id(String art_id) {
		this.art_id = art_id;
	}


	public String getArt_title() {
		return art_title;
	}


	public void setArt_title(String art_title) {
		this.art_title = art_title;
	}


	public String getArt_tags() {
		return art_tags;
	}


	public void setArt_tags(String art_tags) {
		this.art_tags = art_tags;
	}


	public String getArt_pic() {
		return art_pic;
	}


	public void setArt_pic(String art_pic) {
		this.art_pic = art_pic;
	}


	public String getArt_intro() {
		return art_intro;
	}


	public void setArt_intro(String art_intro) {
		this.art_intro = art_intro;
	}


	public String getCopy_url() {
		return copy_url;
	}


	public void setCopy_url(String copy_url) {
		this.copy_url = copy_url;
	}


	public String getArt_content() {
		return art_content;
	}


	public void setArt_content(String art_content) {
		this.art_content = art_content;
	}

	

	public Article() {
		super();
	}


	public Article(String art_id, String art_title, String art_tags,
			String art_pic, String art_intro, String copy_url,
			String art_content) {
		super();
		this.art_id = art_id;
		this.art_title = art_title;
		this.art_tags = art_tags;
		this.art_pic = art_pic;
		this.art_intro = art_intro;
		this.copy_url = copy_url;
		this.art_content = art_content;
	}


	@Override
	public String toString() {
		return "Article [art_id=" + art_id + ", art_title=" + art_title
				+ ", art_tags=" + art_tags + ", art_pic=" + art_pic
				+ ", art_intro=" + art_intro + ", copy_url=" + copy_url
				+ ", art_content=" + art_content + "]";
	}
	
	
	
}
