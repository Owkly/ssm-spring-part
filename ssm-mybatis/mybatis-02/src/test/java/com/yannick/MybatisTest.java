package com.yannick;

import com.yannick.mapper.UserMapper;
import com.yannick.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    private SqlSession sqlSession;

    @BeforeEach
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @AfterEach
    public void clean() {
        sqlSession.close();
    }

    @Test
    public void testInsert() throws IOException {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("yannick");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println("insert: " + user);

    }

    @Test
    public void testUpdate(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setUsername("haha");
        user.setPassword("123456");
        int update = mapper.update(user);
        System.out.println("update: " + user);
    }

    @Test
    public void testDelete() throws IOException {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(3);
        int delete = mapper.delete(3);
        System.out.println("delete success" + user);
    }

    @Test
    public void testSelectById(){

    }

     @Test
    public void testSelectAll(){}
}
