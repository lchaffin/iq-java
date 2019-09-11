package org.qa.iq;

import java.util.*;

/**
 * reverse_words:
 *      take a string of words (sentence) and reverse the order of words
 */
public class reverse_words {
    public static String StringReverse( String orig ){
        Stack<String> word_stack = new Stack<>();
        StringBuilder reversed_string = new StringBuilder();

        List<String> wordList = Arrays.asList(orig.split("\\s+"));

        for( String word : wordList){
            word_stack.push(word);
        }

        while(!word_stack.isEmpty()){
            reversed_string.append(word_stack.pop()).append(" ");
        }
        return reversed_string.toString();
    }

    public static void main(String[] args){
        System.out.println(StringReverse("This is a Mess"));
        System.out.println(StringReverse("This, is a list, of words!"));
    }
}
