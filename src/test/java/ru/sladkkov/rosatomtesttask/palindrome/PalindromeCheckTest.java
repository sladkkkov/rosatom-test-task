package ru.sladkkov.rosatomtesttask.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sladkkov.rosatomtesttask.third.ThirdTask;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckTest {

    @Test
    void testIsPalindrome() {
        Assertions.assertTrue(ThirdTask.isPalindrome("казак"));
        assertTrue(ThirdTask.isPalindrome("потоп"));
        assertTrue(ThirdTask.isPalindrome("дед"));
        assertTrue(ThirdTask.isPalindrome("топот"));
        assertFalse(ThirdTask.isPalindrome("машина"));
        assertFalse(ThirdTask.isPalindrome("привет"));
    }

    @Test
    void testIsPalindromeUsingStringBuilder() {
        assertTrue(ThirdTask.isPalindromeWithStringBuilder("казак"));
        assertTrue(ThirdTask.isPalindromeWithStringBuilder("потоп"));
        assertTrue(ThirdTask.isPalindromeWithStringBuilder("дед"));
        assertTrue(ThirdTask.isPalindromeWithStringBuilder("топот"));
        assertFalse(ThirdTask.isPalindromeWithStringBuilder("машина"));
        assertFalse(ThirdTask.isPalindromeWithStringBuilder("привет"));

    }
}