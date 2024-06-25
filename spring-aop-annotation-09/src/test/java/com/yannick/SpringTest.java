package com.yannick;

import com.yannick.service.Calculator;
import com.yannick.service.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = {JavaConfig.class})
public class SpringTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void test() {
        int result = calculator.add(1, 2);
    }
}
