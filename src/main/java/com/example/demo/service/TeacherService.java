package com.example.demo.service;



import com.example.demo.entities.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    /**
     * 查找所有信息
     *
     * @param
     * @return
     */
    public List<Teacher> findAll() {

        return teacherRepository.findAllByOrderByIdDesc();
    }

    /**
     * 按名字查找
     *
     * @param name 名字
     * @return
     */
    public List<Teacher> findByName(String name) {
        return teacherRepository.findByName(name);
    }


    /**
     * 按名字和密码查找
     *
     * @param name     名字
     * @param password 密码
     * @return
     */
    public List<Teacher> findByNameAndPassword(String name, String password) {
        return teacherRepository.findByNameAndPassword(name, password);
    }

    /**
     * 按名字查找
     *
     * @param name 名字
     * @return
     */
    public List<Teacher> findByNameLike(String name) {
        return teacherRepository.findByNameLike(name);
    }


    /**
     * 保存教师
     *
     * @param teacher
     * @return
     */
    @Transactional
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


    /**
     * 更新教师
     *
     * @param teacher
     * @return
     */
    @Transactional
    public Teacher update(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findOne(Integer id) {
        return teacherRepository.findOne(id);
    }

    public void delete(Integer id) {
        teacherRepository.delete(id);
    }

    public void delete(Integer[] ids) {
        //读取多个ids
        //循环删除它
        Integer len = ids.length;
        for (Integer i = 0; i < len; i++) {
            Teacher teacher = teacherRepository.getOne(ids[i]);
            teacherRepository.delete(teacher);
        }


    }


}
