package org.qa.iq;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;



/**
 * Unit test for simple App.
 */
public class reverseWordTest {

    @Before
    public void setUp() {
        System.out.println("reverseWordTest:Begin");
    }

    @Test
    public void test_reversewords_simple() {
		String orig = "This is a Mess!";
		String reversed = reverse_words.StringReverse(orig);
		assertEquals(reversed, "Mess! a is This "); 
    }

}
