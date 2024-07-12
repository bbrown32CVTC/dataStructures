package edu.cuw.java.unit2;

import java.util.Stack;

public class Exercise2_1 {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        a.push("a");
        a.push("b");
        a.push("c");
        a.push("d");
        a.push("e");
        a.push("f");
        a.push("g");
        System.out.println("Current size: " + a.size());

        //a.remove(4);
        System.out.println("New size: " + a.size());

    }
}
