package com.example.blog.repositories;

import com.example.blog.entities.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestEntity, String> {

}