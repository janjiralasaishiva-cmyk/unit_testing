package org.example.assertions;

import java.util.List;
import java.util.Optional;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Divide by zero");
        return (double) a / b;
    }

    public static String getNull() {
        return null;
    }

    public static List<Integer> numbers() {
        return List.of(1, 2, 3);
    }

    public static Optional<String> getOptional() {
        return Optional.of("JUnit");
    }
}

