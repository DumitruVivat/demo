package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class HistoryTeacher implements Teacher{

    public HistoryTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Who was Stefan cel Mare?";
    }
}
