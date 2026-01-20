package org.example.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeUtilTest {

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level", "Saishiva", "Madam"})
    void isPalindrome(String input) {
        assertEquals(true, PalindromeUtil.isPalindrome(input));
    }
}

