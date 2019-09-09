package org.qa.iq;

/**
 * palindrome 
 *
 */
public class palindrome 
{
	//Simple palindrome checker, does not handle at word level
    static boolean isPalindrome(String str){
		String a = str.replaceAll("\\s+","");
		String b = new StringBuilder(a).reverse().toString();
		return a.equalsIgnoreCase(b);
	}
}
