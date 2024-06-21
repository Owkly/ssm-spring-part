package com.yannick;

import com.yannick.config.JavaConfig;
import com.yannick.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    public void testSpringIoC() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController controller = context.getBean(StudentController.class);
        controller.findAll();
    }
}
