package edu.cuw.java.unit1;

import java.util.ArrayDeque;
import java.util.Stack;

public class Exercise1_4 {

    public static void main(String[] args) {
        Stack<String> start = new Stack<>();

        //Set up the starting stack
        start.push(" Bruce ");
        start.push( " is ");
        start.push(" my name ");

        System.out.print("\nInput: ");

        for (String line : start) {
            System.out.print(line);
        }

        Stack<String> s = reverseOrder(start);

        System.out.print("\nOutput: ");

        for (String line : s) {
            System.out.print(line);
        }
    }

    public static Stack<String> reverseOrder(Stack<String> s) {
        ArrayDeque<String> q = new ArrayDeque<>();

        //Reverse the order of the inputted Stack
        while (!s.isEmpty()) {
            q.addLast(s.pop());
        }

        while (!q.isEmpty()) {
            s.push(q.getFirst());
            q.removeFirst();
        }

        return s;
    }

}
