package com.yannick.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.yannick.controller.StudentController;
import com.yannick.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateTest {
    public void testForJava(){


        DruidDataSource ds = new DruidDataSource();
        ds.setUrl("jdbc:mysql:///studb");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("0000");


        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(ds);
    }

    @Test
    public void testForIoC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);


        // 1
        String sql = "insert into students(id, name, age, gender, class) values(?,?,?,?,?)";
        int rows = jdbcTemplate.update(sql, "11", "二狗子", 21, "男", "三年二班");
        System.out.println("rows: " + rows);



        // 2

        sql = "select * from students where id = ?;";


        Student student1 = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            student.setClasses(rs.getString("class"));
            return student;
        }, 1);

        System.out.println("student1 =" + student1);

        // 3

        sql = "select id, name, gender, age, class as classes from students;";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentList =" + studentList);



    }

    @Test
    public void testQueryAll(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController controller = applicationContext.getBean(StudentController.class);

        controller.findAll();

        applicationContext.close();

    }
}
