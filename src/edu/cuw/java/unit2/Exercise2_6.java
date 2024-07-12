package edu.cuw.java.unit2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise2_6 {

    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

       rotate(numbers, 2, 4);

        System.out.println(numbers);
    }

    public static void rotate(ArrayDeque<Integer> a, int i, int r) {
        if (!a.isEmpty()) {
            int n = a.size();
            int s = (i + r) % n;
            ArrayList<Integer> holder = new ArrayList<>(a);
            Collections.rotate(holder, s);
            a.clear();
            a.addAll(holder);
        }

    }

}
