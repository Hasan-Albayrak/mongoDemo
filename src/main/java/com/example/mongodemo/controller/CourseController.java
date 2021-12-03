package com.example.mongodemo.controller;

import com.example.mongodemo.model.Course;
import com.example.mongodemo.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/course")
@AllArgsConstructor
public class CourseController {
    CourseRepository courseRepository;

    @GetMapping("/allcourses")
    public ResponseEntity allCourses(){
        return ResponseEntity.ok(courseRepository.findAll());
    }

    @PostMapping("/create")
    public ResponseEntity createCourse(@RequestBody Course course){
        return ResponseEntity.ok(courseRepository.insert(course));
    }
}
