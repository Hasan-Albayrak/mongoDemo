package com.example.mongodemo.controller;

import com.example.mongodemo.model.Student;
import com.example.mongodemo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
@AllArgsConstructor
public class StudentController {

    StudentRepository studentRepository;

    @GetMapping("/{id}")
    public ResponseEntity getStudentById(@PathVariable String id){
        return ResponseEntity.ok(studentRepository.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity createStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentRepository.insert(student));
    }
}
