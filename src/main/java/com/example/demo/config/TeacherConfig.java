package com.example.demo.config;

import com.example.demo.common.EnglishTeacher;
import com.example.demo.common.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {

    @Bean("englishTeacher")
    public Teacher englishTeacher() {
        return new EnglishTeacher();
    }
}
