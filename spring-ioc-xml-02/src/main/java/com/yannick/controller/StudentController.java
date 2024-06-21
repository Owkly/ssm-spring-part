package com.yannick.controller;

import com.yannick.pojo.Student;
import com.yannick.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    public void findAll(){
        List<Student> students = studentService.findAll();
        System.out.println("studentController : " + students);
    }
}
