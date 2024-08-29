package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();
    @Test
    public void testIsIntPalindromeTrue() {
        //given
        int[] t = {1, 2, 3, 2, 1};

        //when
        boolean actual = palindrome.isIntPalindrome(t);

        //then
        assertTrue(actual);
    }

    @Test
    public void testIsIntPalindromeFalse() {
        //given
        int[] t = {1, 2, 3, 5, 4, 2, 1};

        //when
        boolean actual = palindrome.isIntPalindrome(t);

        //then
        assertFalse(actual);
    }

    @Test
    public void testIsStringPalindromeTrue() {
        //given
        String s = "ABcbA";

        //when
        boolean actual = palindrome.isStringPalindrome(s);

        //then
        assertTrue(actual);
    }

    @Test
    public void testIsStringPalindromeFalse() {
        //given
        String s = "Asia";

        //when
        boolean actual = palindrome.isStringPalindrome(s);

        //then
        assertFalse(actual);
    }
}