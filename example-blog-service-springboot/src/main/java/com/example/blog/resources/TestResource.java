package com.example.blog.resources;

import com.example.blog.entities.TestEntity;
import com.example.blog.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Test Resource
 *
 * A resource that returns a test entity to ensure your project is set up correctly.
 * It also provides some basic examples of a couple operations.
 * But THIS IS NOT AN EXAMPLE OF A WELL STRUCTURED WEB SERVICE!
 */
@RestController
@RequestMapping(value="/tests", produces= MediaType.APPLICATION_JSON_VALUE)
public class TestResource {
    @Autowired
    TestRepository testRepository;

    @GetMapping
    public ResponseEntity getTests() {
        List<TestEntity> tests = testRepository.findAll();
        return ResponseEntity.ok(tests);
    }

    @PostMapping
    public ResponseEntity createTest(@RequestBody TestEntity test) {
        test = testRepository.save(test);
        return ResponseEntity.ok(test);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTest(@PathVariable("id") String id) {
        testRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}