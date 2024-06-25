package com.yannick.statics;

import com.yannick.Calculator;

public class StaticProxyCalculator implements Calculator {

    private Calculator calculator;

    public StaticProxyCalculator(Calculator target) {
        this.calculator = target;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b);
        int res = calculator.add(a, b);
        System.out.println("result: " + res);
        return res;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("Subtracting " + b + " from " + a);
        int res = calculator.sub(a, b);
        System.out.println("Result: " + res);
        return res;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("Multiplying " + a + " with " + b);
        int res = calculator.mul(a, b);
        System.out.println("Result: " + res);
        return res;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        System.out.println("Dividing " + a + " by " + b);
        int res = calculator.div(a, b);
        System.out.println("Result: " + res);
        return res;
    }
}