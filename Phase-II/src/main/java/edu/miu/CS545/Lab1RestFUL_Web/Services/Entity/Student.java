package edu.miu.CS545.Lab1RestFUL_Web.Services.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Component
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    List<Course> coursesTaken;

    public Student(Long id, String firstName, String lastName, String email, String major, double gpa){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
        this.coursesTaken = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.coursesTaken.add(course);
    }

}
