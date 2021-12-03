package com.example.mongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }


//    @Bean
//    CommandLineRunner runner(StudentRepository repo,
//                             MongoTemplate mongoTemplate){
//        return  args ->{
//            Student student = new Student(
//                    "hasan",
//                    "albayrak",
//                    "hasan@alb.com",
//                    new Gender("Male"),
//                    new Address("Zümrütevler"),
//                    List.of("CSE"),
//                    BigDecimal.TEN,
//                    LocalDateTime.now()
//            );
//            Query query = new Query();
//            query.addCriteria(Criteria.where("email").is("email"));
//            List<Student> studentList = mongoTemplate.find(query, Student.class);
//            repo.insert(student);
//        };
//    }
}
