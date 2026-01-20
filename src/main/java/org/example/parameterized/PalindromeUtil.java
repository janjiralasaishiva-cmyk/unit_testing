package org.example.parameterized;

public class PalindromeUtil{

    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

