package edu.miu.CS545.Lab1RestFUL_Web.Services.Repository;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();
    //Course course = new Course();

    public CourseRepo() {
        Course c1 = new Course(1L, "FPP", "CS390");
        Course c2 = new Course(2L, "MPP", "CS401");
        Course c3 = new Course(3L, "WAP", "CS472");
        Course c4 = new Course(4L, "EA", "CS544");
        Course c5 = new Course(5L, "WAA", "CS545");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
    }

    public List<Course> findAllCourses(){
        return courses;
    }

    public Course findById(Long id){
        Course Cr = new Course();
        for(Course c: courses){
            if(id==c.getId()){
                Cr=c;
            }
        }
        return Cr;
    }

    public Course save(Course course){
        course.setId(course.getId());
        course.setCode(course.getCode());
        course.setName(course.getName());
        return course;
    }

    public Course update (Course course, Long id){
        Course course1 = findById(id);
        //var course1 = courses.stream().filter(c -> c.getId() == id).findFirst();

        course.setId(course.getId());
        course.setCode(course.getCode());
        course.setName(course.getName());
        courses.add(course);

        return course1;
    }

    public void delete(Long id){
        Course course = findById(id);
        courses.remove(course);
    }

}
