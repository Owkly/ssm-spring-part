package com.yannick;

import com.yannick.config.JavaConfiguration;
import com.yannick.config.JavaConfigurationA;
import com.yannick.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        StudentController bean = context.getBean(StudentController.class);
        System.out.println("bean = " + bean);

    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurationA.class);
    }
}
