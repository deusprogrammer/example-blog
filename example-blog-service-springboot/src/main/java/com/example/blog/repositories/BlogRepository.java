package com.example.blog.repositories;

import com.example.blog.entities.BlogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BlogRepository extends MongoRepository<BlogEntity, String> {
    List<BlogEntity> findByOwner(String owner);
}