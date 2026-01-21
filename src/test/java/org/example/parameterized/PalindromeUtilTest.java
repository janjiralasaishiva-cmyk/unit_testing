package org.example.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeUtilTest {

//    @ParameterizedTest
    // Case 1: You can use ValueSource() if you are using @ParameterizedTest
//    @ValueSource(strings = {"madam", "racecar", "level", "Saishiva", "Madam"})
//    void isPalindrome(String input) {
//        assertEquals(true, PalindromeUtil.isPalindrome(input));
//    }
    @ParameterizedTest
    @ValueSource(strings = {"madam"})
    void checkPalindrome(String s){
        assertEquals(true, PalindromeUtil.isPalindrome(s));
    }
}

