package com.yannick.test;

import com.yannick.dao.BaseDao;
import com.yannick.dao.SysScheduleDao;
import com.yannick.dao.impl.SysScheduleDaoImpl;
import com.yannick.pojo.SysSchedule;
import com.yannick.pojo.SysUser;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestWeb {
    private static BaseDao baseDao;
    private static SysScheduleDao sysScheduleDao;



    @Test
    public void test0() {
        String url = "jdbc:mysql://localhost:3306/mybatis-example";
        String username = "root";
        String password = "0000";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Database connected successfully!");
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test() {
        baseDao = new BaseDao();

        // 1
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println("count:" + count);

        // 2
        sql = "select uid, username, user_pwd userPwd from sys_user";
        List<SysUser> users = baseDao.baseQuery(SysUser.class, sql);
        users.forEach(System.out::println);

        // 3
        sql = "insert into sys_schedule values (DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql,1 ,"apprendre java",0);
        System.out.println(rows);
    }

    @Test
    public void test1() {
        sysScheduleDao = new SysScheduleDaoImpl();
        int rows = sysScheduleDao.addSchedule(new SysSchedule(null, 2, "test", 0));
        System.out.println(rows);
    }

    @Test
    public void test2(){
        sysScheduleDao = new SysScheduleDaoImpl();
        List<SysSchedule> sysSchedules = sysScheduleDao.selecAlltSchedule();
        sysSchedules.forEach(System.out::println);

    }



}
