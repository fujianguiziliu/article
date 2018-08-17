
package com.dayi.entity;

public class Categories {
	private Integer cate_id;
	private String cate_img;
	private String cate_name;
	private String cate_dir;
	public Integer getCate_id() {
		return cate_id;
	}
	public void setCate_id(Integer cate_id) {
		this.cate_id = cate_id;
	}
	public String getCate_img() {
		return cate_img;
	}
	public void setCate_img(String cate_img) {
		this.cate_img = cate_img;
	}
	public String getCate_name() {
		return cate_name;
	}
	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}
	public String getCate_dir() {
		return cate_dir;
	}
	public void setCate_dir(String cate_dir) {
		this.cate_dir = cate_dir;
	}
	public Categories(Integer cate_id, String cate_img, String cate_name,
			String cate_dir) {
		super();
		this.cate_id = cate_id;
		this.cate_img = cate_img;
		this.cate_name = cate_name;
		this.cate_dir = cate_dir;
	}
	public Categories() {
		super();
	}
	@Override
	public String toString() {
		return "Categories [cate_id=" + cate_id + ", cate_img=" + cate_img
				+ ", cate_name=" + cate_name + ", cate_dir=" + cate_dir + "]";
	}
	
	
	
	
	
}
