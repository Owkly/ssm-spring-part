package com.yannick;

import com.yannick.components.A;
import com.yannick.components.B;
import config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = {JavaConfig.class})
public class SpringTest {

    @Autowired
    private A a;

    @Autowired
    private B b;

    @Test
    public void test() {

        System.out.println(a.getClass());
    }
}

