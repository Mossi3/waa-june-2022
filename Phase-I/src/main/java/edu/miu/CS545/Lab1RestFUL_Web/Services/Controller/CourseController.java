package edu.miu.CS545.Lab1RestFUL_Web.Services.Controller;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Student;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course>  getAllCourses(){
        List<Course> courses = courseService.findAll();
        return courses;
    }

    @GetMapping ("/{id}")
    public Course getCourseById(@PathVariable Long id){
        Course course = courseService.findById(id);
        return course;
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course){
        Course c = courseService.save(course);
        return c;
    }

    @PutMapping ("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course){
        Course c= courseService.update(course,id);
        return c;
    }

    @DeleteMapping ("/{id}")
    public void removingCourse(@PathVariable Long id){
        courseService.delete(id);
    }

}
