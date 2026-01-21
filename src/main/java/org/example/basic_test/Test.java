package org.example.basic_test;

public class Test {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        if(b == 0)
            throw new ArithmeticException("Divide by zero");
        return (double)a / b;
    }
}
