package com.yannick;

import com.yannick.mapper.CustomerMapper;
import com.yannick.mapper.EmployeeMapper;
import com.yannick.mapper.OrderMapper;
import com.yannick.pojo.Customer;
import com.yannick.pojo.Employee;
import com.yannick.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private SqlSession sqlSession;
    @BeforeEach
    public void setUp() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @AfterEach
    public void cleanUp() throws Exception {
        sqlSession.close();
    }

    @Test
    public void  testToOne(){
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderById(1);
        System.out.println(order);
        System.out.println(order.getCustomer());
    }

    @Test
    public void  testToMany(){
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryList(1);
        System.out.println("customers = " + customers);

        for(Customer customer : customers){
            List<Order> orderList = customer.getOrderList();
            System.out.println("orders = " + orderList);
        }
    }

    @Test
    public void  ifWhere(){
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> list = mapper.query(null,100.0);
        System.out.println("list = " + list);
    }
}
