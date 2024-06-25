package com.yannick;

import com.yannick.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void testSelectEmployee() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        com.yannick.mapper.EmployeeMapper mapper = sqlSession.getMapper(com.yannick.mapper.EmployeeMapper.class);
        Employee employee = mapper.selectByPrimaryKey(2);
        System.out.println("employee:" + employee);

//        Map<String,Object> selectEmpNameAndMaxSalary();

//        List<String> queryNameBySalary(Double salary);

        sqlSession.commit();
        sqlSession.close();

    }

}
