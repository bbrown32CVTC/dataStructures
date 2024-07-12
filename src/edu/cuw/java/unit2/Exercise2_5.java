package edu.cuw.java.unit2;

import java.util.ArrayList;

public class Exercise2_5 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        rotate(numbers, 4);

        System.out.println(numbers);
    }

    public static void rotate(ArrayList<Integer> a, int r) {
        if (a != null && !a.isEmpty()) {
            ArrayList<Integer> holder = new ArrayList<>(a);
            for (int i = 0; i < holder.size(); i++) {
                a.set(i, holder.get((i + r) % holder.size()));
            }

        }

    }

}
