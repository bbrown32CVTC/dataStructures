package edu.cuw.java.unit1;

import java.util.Stack;

public class Exercise1_3 {

    public static void main(String[] args) {
        String matchedInput = "{{()[]}}";

        if (isMatchedString(matchedInput)) {
            System.out.println("Input string is matched.");
        } else {
            System.out.println("Input string is not matched.");
        }

        String unmatchedInput = "{{()]}}";

        if (isMatchedString(unmatchedInput)) {
            System.out.println("Input string is matched.");
        } else {
            System.out.println("Input string is not matched.");
        }

        String input = "{{[()]}}";

        if (isMatchedString(input)) {
            System.out.println("Input string is matched.");
        } else {
            System.out.println("Input string is not matched.");
        }

        String extraInput = "{{[(])}}";

        if (isMatchedString(extraInput)) {
            System.out.println("Input string is matched.");
        } else {
            System.out.println("Input string is not matched.");
        }

    }

    public static boolean isMatchedString(String input) {
        Stack<Character> charStack = new Stack<>();

        for (char c: input.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                charStack.push(c);

            } else if (c == '}' || c == ')' || c == ']') {
                if (charStack.isEmpty()) {
                    return false;  //Invalid string if charStack is empty
                }

                char starter = charStack.pop();

                if ((c == '}' && starter !='{') || (c == ')' && starter != '(') || (c == ']' && starter != '[')) {
                    return false;  //Mismatched string if the starting character does not match any ending character
                }
            }

        }

        return charStack.isEmpty(); // Returns true if charStack is empty, false if not empty
    }

}
