package com.yannick.service.Impl;

import com.yannick.dao.StudentDao;
import com.yannick.pojo.Student;
import com.yannick.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryAll();
        System.out.println("studentService :"+studentList);
        return studentList;
    }
}
