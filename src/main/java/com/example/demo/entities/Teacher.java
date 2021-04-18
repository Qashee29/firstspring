package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 学生实体
 */
@Getter
@Setter
@ToString
@Entity(name="teacher")
public class Teacher {
    /**
     * 教师id，主键
     */
    @Id
    @GeneratedValue
    protected Integer id;
    /**
     * 教师姓名
     */
    private String name;
    /**
     * 教师职称
     */
    private String title;
    /**
     * 教师密码
     */
    private String password;
    /**
     * 教师登录时间
     */
    private String loginTime;

}
