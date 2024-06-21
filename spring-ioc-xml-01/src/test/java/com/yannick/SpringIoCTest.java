package com.yannick;

import com.yannick.ioc_03.HappyComponent;
// import com.yannick.ioc_04.JavaBean;
import com.yannick.ioc_05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    public void createIoC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("spring-03.xml");
        applicationContext.refresh();
    }

     @Test
    public void getBeanFromIoC(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("spring-03.xml");
        applicationContext.refresh();
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");
        HappyComponent happyComponent2 =  applicationContext.getBean("happyComponent", HappyComponent.class);

        happyComponent2.doSomething();
    }

    @Test
    public void test_04(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-04.xml");

        applicationContext.close();
    }

    @Test
    public void test_05(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-05.xml");
        applicationContext.refresh();
        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);
        System.out.println("JavaBean = "+ javaBean );

        Object bean = applicationContext.getBean("&javaBean");
        System.out.println("bean = " + bean);

        applicationContext.close();
    }
}
