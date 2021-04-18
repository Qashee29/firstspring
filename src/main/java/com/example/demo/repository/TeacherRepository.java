package com.example.demo.repository;

import com.example.demo.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    public List<Teacher> findAllByOrderByIdDesc();

    public List<Teacher> findByName(String name);

    public List<Teacher> findByNameAndPassword(String name, String password);

    public List<Teacher> findByNameLike(String name);



}
