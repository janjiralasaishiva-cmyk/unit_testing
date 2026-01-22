package org.example.iterator_fails_assertlines_pass;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class AssertLineMatch {
    @Test
    void iterableFails_linesPass() {
        List<String> expectedIterable = List.of(
                "User: 123",
                "Status: OK"
        );

        List<String> actual = List.of(
                "User: 999",
                "Status: OK"
        );

        // FAIL: strings are not equal
        assertIterableEquals(expectedIterable, actual);

        // PASS: regex allows variation
        assertLinesMatch(
                List.of(
                        "User: \\d+",     // matches any number
                        "Status: OK"
                ),
                actual
        );
    }

}
