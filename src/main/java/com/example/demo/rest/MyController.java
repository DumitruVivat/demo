package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Teacher teacher;
    private Teacher secondTeacher;

    @Autowired
    public MyController(@Qualifier("mathTeacher") Teacher teacher,
                        @Qualifier("mathTeacher") Teacher secondTeacher) {
        System.out.println("Bean of class - " + this.getClass().getName());
        this.secondTeacher = secondTeacher;
        this.teacher = teacher;
    }
    @GetMapping("/homework")
    public String getHomeWork() {
        return teacher.getHomeWork();
    }

    @GetMapping("/compTeachers")
    public String compareTeachers() {
        return "First teacher - " + teacher + "....." +
                "Second teacher - " + secondTeacher + "....." +
                "CompareTeachers - " + (teacher == secondTeacher);
    }
}
