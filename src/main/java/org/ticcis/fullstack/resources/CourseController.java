package org.ticcis.fullstack.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.ticcis.fullstack.model.Course;
import org.ticcis.fullstack.services.CourseService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8000","http://locahost:9000"})
@RestController
public class CourseController {
    @Autowired
    public CourseService courseService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getListOfCourses(@PathVariable String username){
        return courseService.findAll();
    }
}
