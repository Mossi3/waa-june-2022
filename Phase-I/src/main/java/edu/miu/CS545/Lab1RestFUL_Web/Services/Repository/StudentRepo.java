package edu.miu.CS545.Lab1RestFUL_Web.Services.Repository;

import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Course;
import edu.miu.CS545.Lab1RestFUL_Web.Services.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {
    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses =new ArrayList<>();

    public StudentRepo(){
        Course c1 = new Course(1L, "FPP", "CS390");
        Course c2 = new Course(2L, "MPP", "CS401");
        Course c3 = new Course(3L, "WAP", "CS472");
        Course c4 = new Course(4L, "EA", "CS544");
        Course c5 = new Course(5L, "WAA", "CS545");

        Student student1 = new Student(1L,"Tesfay","Hidray","THidray@miu.edu","Compro", 3.8);
        student1.addCourse(c1);
        student1.addCourse(c2);
        student1.addCourse(c3);

        Student student2 = new Student(2L,"Kulut","Tesfamariam","KTesfamariam@miu.edu","MSD", 3.96);
        student2.addCourse(c1);
        student2.addCourse(c2);
        student2.addCourse(c3);
        student2.addCourse(c4);
        student2.addCourse(c5);

        Student student3 = new Student(3L,"Natnael","Berhe","NBerhe@miu.edu","Business", 3.96);
        student3.addCourse(c1);
        student3.addCourse(c2);
        student3.addCourse(c3);
        student3.addCourse(c4);
        student3.addCourse(c5);
         }

         public List<Student> findAllStudents(){
                return students;
         }


         public Student findStudentById(Long id){
             Student st = new Student();
             for(Student s: students){
                 if(id==s.getId()){
                     st=s;
                 }
             }
             return st;
         }

         public Student save(Student student){
//             Student student1 = new Student();
//             student1.setId(student.getId());
//             student1.setFirstName(student.getFirstName());
//             student1.setLastName(student.getLastName());
//             student1.setEmail(student.getEmail());
//             student1.setMajor(student.getMajor());
//             student1.setGpa(student.getGpa());
//             student1.ad
             this.students.add(student);
             return student;

         }

         public Student update(Student student, Long id){
             Student student1 = new Student();
             Course Course = new Course();
             student1.setId(student.getId());
             student1.setFirstName(student.getFirstName());
             student1.setLastName(student.getLastName());
             student1.setEmail(student.getEmail());
             student1.setMajor(student.getMajor());
             student1.setGpa(student.getGpa());

             students.add(student1);
             return student1;
         }

         public void delete(Long id){
             Student student = findStudentById(id);
             students.remove(student);
         }






}
