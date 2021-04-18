package com.example.demo.controller;


import com.example.demo.entities.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<Teacher> sayHi() {

        List<Teacher> teachers = teacherService.findAll();
        return teachers;


    }
}
