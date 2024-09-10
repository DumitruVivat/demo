package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class MathTeacher implements Teacher{

    public MathTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Solve equation";
    }
}
