package com.example.mongodemo.repository;

import com.example.mongodemo.model.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstructorRepository extends MongoRepository<Instructor, String> {
    Optional<Instructor> findInstructorByName(String name);
}
