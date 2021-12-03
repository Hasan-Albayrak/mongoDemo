package com.example.mongodemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document
@AllArgsConstructor
public class Instructor {
    @Id
    private String id;
    private String name;
//    @DBRef(lazy = true)
    private List<String> courseNames;
    private Integer age;
}
