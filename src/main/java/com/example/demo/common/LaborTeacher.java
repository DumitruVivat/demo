package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class LaborTeacher implements Teacher{

    public LaborTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Make a furniture";
    }
}
