package org.example.jvmtesting;

import org.example.jvmonly.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {

        testAddition();
        testDivision();
        testDivideByZero();

        System.out.println("ALL TESTS PASSED");
    }

    static void testAddition() {
        int result = Calculator.add(2, 3);
        if (result != 5) {
            throw new AssertionError(
                    "testAddition failed: expected 5 but got " + result
            );
        }
    }

    static void testDivision() {
        int result = Calculator.divide(10, 2);
        if (result != 5) {
            throw new AssertionError(
                    "testDivision failed: expected 5 but got " + result
            );
        }
    }

    static void testDivideByZero() {
        try {
            Calculator.divide(10, 0);
            throw new AssertionError(
                    "testDivideByZero failed: exception expected"
            );
        } catch (ArithmeticException expected) {
            // test passes
        }
    }
}

