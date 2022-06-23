package edu.miu.CS545.Lab1RestFUL_Web.Services.Service.Implementations;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Repository.CourseRepo;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> findAll() {
        return courseRepo.findAllCourses();
    }

    @Override
    public Course findById (Long id){
        return courseRepo.findById(id);
    }

    @Override
    public Course save(Course course){
        course = courseRepo.save(course);
        return course;
    }

    @Override
    public Course update(Course course, Long id){
        course = courseRepo.update(course,id);
        return course;
    }
    @Override
    public void delete(Long id){
        courseRepo.delete(id);
    }
}
