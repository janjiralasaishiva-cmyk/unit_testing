package org.example.basic_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTests {
    private Test test = new Test();
    @org.junit.jupiter.api.Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Test test = new Test();
        assertEquals(2, test.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(textBlock = """
			0,    1,   1
			1,    2,   3
			49,  51, 100
			1,  100, 101
			""")
     void add(int first, int second, int expectedResult) {
        Test test = new Test();
        assertEquals(expectedResult, test.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
