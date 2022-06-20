package edu.miu.CS545.Lab1RestFUL_Web.Services.Service;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    Course findById(Long id);

    Course save(Course course);

    Course update(Course course, Long id);

    void delete(Long id);
}
