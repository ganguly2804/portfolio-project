package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.BlogsRepository;
import com.example.demo.model.Blogs;

@RestController
public class BlogsPageController {
	
	@Autowired
	public BlogsRepository blogsRepository;
	
	@GetMapping(value = "/getallblogs")
	public List<Blogs> getAllStudents() {
		return blogsRepository.findAll();
	}
	
	@PostMapping(value = "/insertblog")
	public String createStudent(@RequestBody Blogs blog) {
		Blogs insertedblog = blogsRepository.insert(blog);
		return "Blog inserted : " + insertedblog.getBlog_title();
	}
}
