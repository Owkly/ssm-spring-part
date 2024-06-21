package com.yannick.controller;

import com.yannick.pojo.Student;
import com.yannick.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void findAll(){
        List<Student> students = studentService.findAll();
        System.out.println("studentController : " + students);
    }
}
