package edu.miu.CS545.Lab1RestFUL_Web.Services.Controller;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Student;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping ("/{id}")
    public Student findStudentById(@PathVariable Long id){
        Student student = studentService.findStudentById(id);
        return student;
    }

    @PostMapping
    public  Student save(@RequestBody Student student){
        Student student1 = studentService.save(student);
        return student1;
    }

    @PutMapping ("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student){
        Student student1=studentService.update(student,id);
        return (student1);
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Long id){
        studentService.delete(id);
    }

//    @GetMapping
//    public List<Student> findStudentByMajor(@RequestParam String major){
//        List < Student> students= studentService.getStudentsByMajor(major);
//        return students;
//    }
//
//    @GetMapping ("/{id}/courses")
//    public List<Course> getCoursesByStudentId(@PathVariable Long id){
//        List<Course> courses = studentService.getCoursesByStudentId(id);
//        return courses;
//    }
}
