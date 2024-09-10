package com.example.demo.common;

public class EnglishTeacher implements Teacher{

    public EnglishTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Learn 100 of new words";
    }
}
