package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FootballTeacher implements Teacher{

    public FootballTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Run 10 km";
    }
}
