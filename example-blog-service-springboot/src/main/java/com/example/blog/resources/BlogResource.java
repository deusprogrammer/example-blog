package com.example.blog.resources;

import com.example.blog.entities.BlogEntity;
import com.example.blog.objects.Comment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/v1/blogs", produces= MediaType.APPLICATION_JSON_VALUE)
public class BlogResource {
    @GetMapping
    public ResponseEntity getBlogs() {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createBlog(@RequestBody BlogEntity blogEntity) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getBlog(@PathVariable("id") String blogId) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateBlog(@PathVariable("id") String blogId, @RequestBody BlogEntity blogEntity) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity deleteBlog(@PathVariable("id") String blogId) {
        // TODO Fill in here

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value="/{id}/comments", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addCommentToBlog(@PathVariable("id") String id, @RequestBody Comment comment) {
        // TODO Fill in here

        return ResponseEntity.ok().build();
    }
}
