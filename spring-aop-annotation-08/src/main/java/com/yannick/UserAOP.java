package com.yannick;

import com.yannick.statics.StaticProxyCalculator;

public class UserAOP {
    public static void main(String[] args) {
        Calculator target = new CalculatorPureImpl();

        Calculator proxy = new StaticProxyCalculator(target);

        proxy.add(1, 2);
        proxy.mul(2, 4);
        proxy.div(2, 3);
        proxy.sub(1, 2);
    }
}
