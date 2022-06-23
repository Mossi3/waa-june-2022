package edu.miu.CS545.Lab1RestFUL_Web.Services.Service;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Student;

import java.util.List;

public interface StudentService {

     List<Student> findAllStudents();

     Student findStudentById(Long id);

     Student save(Student student);

     Student update(Student student, Long id);

     void delete(Long id);

     List<Student> getStudentsByMajor(String major);

     List<Course> getCoursesByStudentId(Long studentId);
}
