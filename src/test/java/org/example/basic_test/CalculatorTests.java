package org.example.basic_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTests {
//    @org.junit.jupiter.api.Test
//    @DisplayName("1 + 1 = 2")
//    void addsTwoNumbers() {
//        assertEquals(2, Test.add(1, 1), "1 + 1 should equal 2");
//    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(textBlock = """
			0,    1,   1
			1,    2,   3
			49,  51, 100
			1,  100, 101
			""")
     void add(int first, int second, int expectedResult) {
        assertEquals(expectedResult, Test.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(textBlock = """
            10, 20, 30
            20, 30, 50
            0, 1, 1
            -3, 2, -1
            -2, -7, -9
            """)
    void addition(int first, int second, int expectedResult){
        assertEquals(expectedResult, Test.addition(first, second));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            10, 20, -10
            70, 30, 40
            2, 1, 1
            -3, 2, -5
            -2, -7, 5
            """)
    void subtract(int first, int second, int expectedResult){
        assertEquals(expectedResult, Test.subtract(first, second));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            10, 20, 200
            20, 30, 600
            0, 1, 0
            -3, 2, -6
            -2, -7, 14
            """)
    void multiply(int fist, int second, int expectedResult){
        assertEquals(expectedResult, Test.multiply(fist, second));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            10, 20, 0.5
            20, 2, 10.0
            0, 1, 0
            -3, 2, -1.5
            """)
    void divide(int first, int second, double expectedResult){
        assertEquals(expectedResult, Test.divide(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 0.5",
            "20, 2, 10.0",
            "0, 1, 0.0",
            "-3, 2, -1.5"
    })
    void divide_valid(int a, int b, double expected) {
        assertEquals(expected, Test.divide(a, b));
    }

    // For arithmetic exception
    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "-2, 0"
    })
    void divide_by_zero(int a, int b) {
        // we can use this
        assertThrows(ArithmeticException.class, () -> Test.divide(a, b));
        // or this
//        assertThrows(RuntimeException.class, () -> Test.divide(a, b));
    }

}
