package com.example.demo.webapi;

import com.example.demo.entities.Teacher;
import com.example.demo.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/webapi/teacher")


public class TeacherRestController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/add")

    public Teacher add(Teacher teacher){
        teacher=teacherService.save(teacher);
        return teacher;
    }
    @RequestMapping("delete/{id}")
    public  boolean delete(@PathVariable Integer id){

        teacherService.delete(id);
        return  true;
    }

    @RequestMapping("/update")
    public  Teacher update(Teacher teacher){
        teacher=teacherService.update(teacher);
        return teacher;
    }

    @RequestMapping("/get/{id}")
    public Teacher getById(@PathVariable  Integer id){

        return teacherService.findOne(id);

    }

    @RequestMapping("/getAll")
    public List<Teacher> getAll(){

        return teacherService.findAll();

    }
    @RequestMapping("/delete")
    public void delete(@RequestParam("ids[]") Integer[] ids){

//        String[] newids=ids.split(",");
//        System.out.println(newids.length);
        teacherService.delete(ids);

    }
}
