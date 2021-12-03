package com.example.mongodemo.controller;

import com.example.mongodemo.model.Instructor;
import com.example.mongodemo.repository.InstructorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/instructor")
@AllArgsConstructor
public class InstructorController {
    InstructorRepository instructorRepository;

    @GetMapping("/{name}")
    public ResponseEntity getInstructor(@PathVariable String name){
        return ResponseEntity.ok(instructorRepository.findInstructorByName(name).get());

    }
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Instructor instructor){
        return ResponseEntity.ok(instructorRepository.insert(instructor));
    }
}
