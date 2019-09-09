package org.qa.iq;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.Before;



/**
 * Unit test for simple App.
 */
public class palindromeTest {

    @Before
    public void setUp() {
        System.out.println("palindromeTest:Begin");
    }

    @Test
    public void test_palindrome_simple() {
        assertTrue("Simple Test", palindrome.isPalindrome("racecar"));
    }

    @Test
    public void test_palindrome_mixed_case() {
        // This one is word based, expect to fail
        assertFalse("Mixed case test 1", palindrome.isPalindrome("King are you glad you are king"));
        assertTrue("Mixed case test 2", palindrome.isPalindrome("Race Car"));
    }

    @Test
    public void test_palindrome_whitespace() {
        assertTrue("Whitespace test", palindrome.isPalindrome("Race     Car"));
    }

    @Test
    public void test_palindrome_complicated() {
        assertTrue("Complicated test", palindrome.isPalindrome("A b C d e F     G h     i   j   k l MNO pqr s t U   V w         x y z z y x wvutsrqponmlkjihgfedcba"));
    }

}
