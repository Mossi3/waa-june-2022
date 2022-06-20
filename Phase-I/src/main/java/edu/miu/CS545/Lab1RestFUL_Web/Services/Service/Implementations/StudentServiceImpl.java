package edu.miu.CS545.Lab1RestFUL_Web.Services.Service.Implementations;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Student;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Repository.StudentRepo;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> findAllStudents(){
        return studentRepo.findAllStudents();
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepo.findStudentById(id);
    }


    @Override
    public Student save(Student student){
        Student student1 = studentRepo.save(student);
        return student1;
    }

    @Override
    public Student update(Student student, Long id){
        student = studentRepo.update(student,id);
        return student;

    }
    @Override
    public void delete(Long id){
        studentRepo.delete(id);
    }
    @Override
    public List<Student> getStudentsByMajor(String major){
        return  studentRepo.findAllStudents().stream()
                .filter(s -> s.getMajor().equals(major))
                .collect(Collectors.toList());
    }

    @Override
    public List<Course> getCoursesByStudentId(Long studentId){
        return studentRepo.findStudentById(studentId).getCoursesTaken();

    }
}
