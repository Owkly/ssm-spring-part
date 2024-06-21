package com.yannick.dao;

import com.yannick.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> queryAll();
}
