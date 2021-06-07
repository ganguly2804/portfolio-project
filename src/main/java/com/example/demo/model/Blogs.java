package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blogs")
public class Blogs {
	
	private long blog_id;
	private String blog_title;
	private String blog_date;
	private String blog_content;

	public Blogs() {
		super();
	}

	public Blogs(long blog_id, String blog_title, String blog_date, String blog_content) {
		super();
		this.blog_id = blog_id;
		this.blog_title = blog_title;
		this.blog_date = blog_date;
		this.blog_content = blog_content;
	}

	public long getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(long blog_id) {
		this.blog_id = blog_id;
	}

	public String getBlog_title() {
		return blog_title;
	}

	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}

	public String getBlog_date() {
		return blog_date;
	}

	public void setBlog_date(String blog_date) {
		this.blog_date = blog_date;
	}

	public String getBlog_content() {
		return blog_content;
	}

	public void setBlog_content(String blog_content) {
		this.blog_content = blog_content;
	}

}
