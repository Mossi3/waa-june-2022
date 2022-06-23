package edu.miu.CS545.Lab1RestFUL_Web.Services.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Course {
    private Long id;
    private String name;
    private String code;

    public Course(Long id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;

    }

    private boolean deleted;
}
