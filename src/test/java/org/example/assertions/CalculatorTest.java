package org.example.assertions;

import org.example.assertions.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // 1️⃣ Equality
    @Test
    void equalityAssertions() {
        assertEquals(4, Calculator.add(2, 2));
        assertNotEquals(5, Calculator.add(2, 2));
    }

    // 2️⃣ Floating-point (delta)
    @Test
    void floatingPointAssertion() {
        assertEquals(0.5, Calculator.divide(1, 2), 1e-5);
    }

    // 3️⃣ Boolean
    @Test
    void booleanAssertions() {
        assertTrue(10 > 5);
        assertFalse(5 > 10);
    }

    // 4️⃣ Null / Not null
    @Test
    void nullAssertions() {
        assertNull(Calculator.getNull());
        assertNotNull("JUnit");
    }

    // 5️⃣ Same / Not same (identity)
    @Test
    void identityAssertions() {
        String a = "test";
        String b = a;
        String c = new String("test");

        assertSame(a, b);
        assertNotSame(a, c);
    }

    // 6️⃣ Arrays
    @Test
    void arrayAssertions() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

    // 7️⃣ Collections / Iterables
    @Test
    void iterableAssertions() {
        List<Integer> expected = List.of(1, 2, 3);
        List<Integer> actual = Calculator.numbers();

        assertIterableEquals(expected, actual);
    }

    // 8️⃣ Exceptions
    @Test
    void exceptionAssertions() {
        assertThrows(ArithmeticException.class,
                () -> Calculator.divide(10, 0));

        assertDoesNotThrow(() -> Calculator.divide(10, 2));
    }

    // 9️⃣ Timeouts
    @Test
    void timeoutAssertions() {
        assertTimeout(Duration.ofMillis(100),
                () -> Thread.sleep(50));
    }

    // 🔟 Grouped assertions
    @Test
    void groupedAssertions() {
        Optional<String> opt = Calculator.getOptional();

        assertAll("optional checks",
                () -> assertTrue(opt.isPresent()),
                () -> assertEquals("JUnit", opt.get()),
                () -> assertNotNull(opt)
        );
    }

    // 1️⃣1️⃣ String line comparison
    @Test
    void lineAssertions() {
        List<String> expected = List.of("one", "two");
        List<String> actual = List.of("one", "two");

        assertLinesMatch(expected, actual);
    }

    // 1️⃣2️⃣ Explicit failure
    @Test
    void failExample() {
        if (false) {
            fail("This should never execute");
        }
    }

    // 1️⃣3️⃣ Iterable/Collection
    @Test
    void collectionTest(){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);


        assertIterableEquals(l1, l2, () -> l2.size() > l1.size() ?
                                            l2.size()+ " is greater than "+l1.size() :
                                            l1.size() + " is greater than "+ l2.size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"sai", "shiva"})
    void parameterTest(String s){
        assertEquals("sai", s);
    }
}
