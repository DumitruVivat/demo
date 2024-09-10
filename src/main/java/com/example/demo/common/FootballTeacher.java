package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Run 10 km";
    }
}
