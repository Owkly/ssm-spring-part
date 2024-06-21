package com.yannick.service.Impl;

import com.yannick.dao.StudentDao;
import com.yannick.pojo.Student;
import com.yannick.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryAll();
        System.out.println("studentService :"+studentList);
        return studentList;
    }
}
