package com.example.demo.controller;



import com.example.demo.entities.Teacher;
import com.example.demo.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/teacher1")
public class TeacherControllerOneStage {
    @Autowired
    TeacherService teacherService;

    @PostMapping
    public Teacher add(Teacher teacher){
        teacher = teacherService.save(teacher);
        return teacher;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        teacherService.delete(id);
        return true;
    }

    @PutMapping
    public Teacher update(Teacher teacher){
        teacherService.update(teacher);
        return teacher;
    }

    @GetMapping("/{id}")
    public Teacher getById(@PathVariable  Integer id){

        return teacherService.findOne(id);

    }

    @GetMapping()
    public List<Teacher> getAll(){

        return teacherService.findAll();

    }


}

