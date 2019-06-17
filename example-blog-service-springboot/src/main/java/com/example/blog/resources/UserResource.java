package com.example.blog.resources;

import com.example.blog.entities.UserEntity;
import com.example.blog.objects.AuthenticationObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/v1/users", produces=MediaType.APPLICATION_JSON_VALUE)
public class UserResource {
    @GetMapping
    public ResponseEntity getUsers() {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createUser(@RequestBody UserEntity userEntity) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{username}")
    public ResponseEntity getUser(@PathVariable("username") String username) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/{username}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateUser(@PathVariable("username") String username, @RequestBody UserEntity userEntity) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{username}")
    public ResponseEntity deleteUser(@PathVariable("username") String username) {
        // TODO Fill in here

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value="/tokens", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity authenticateUser(@RequestBody AuthenticationObject authenticationObject) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }
}