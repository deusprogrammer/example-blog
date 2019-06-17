package com.example.blog.repositories;

import com.example.blog.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
    void deleteByUsername(String username);
}
