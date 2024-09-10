package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Who was Stefan cel Mare?";
    }
}
