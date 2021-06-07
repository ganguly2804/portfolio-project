package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Blogs;

@Repository
public interface BlogsRepository extends MongoRepository<Blogs, Long>{}
