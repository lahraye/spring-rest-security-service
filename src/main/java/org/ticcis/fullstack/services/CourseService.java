package org.ticcis.fullstack.services;

import org.springframework.stereotype.Service;
import org.ticcis.fullstack.model.Course;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private static List<Course> courses = new ArrayList<>();
    private static long idCounter = 0;
    static {
        courses.add(new Course(++idCounter, "lare", "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(++idCounter, "joe", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(++idCounter, "tom", "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(++idCounter, "lare",
                "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
    }
    public List<Course> findAll(){
        return courses;
    }
}
