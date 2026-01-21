package org.example.jvmonly;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
