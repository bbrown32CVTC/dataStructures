package edu.cuw.java.unit2.trialdeque;

public class Exercise2_7 {

    public static void main(String[] args) {
        modArrayDeque<Integer> numbers = new modArrayDeque<>();
        numbers.add(0, 3);
        numbers.add(1, 6);
        numbers.add(2, 9);
        numbers.add(3, 12);
        numbers.add(0, 15);
        numbers.add(2, 18);
        numbers.remove(2);

        System.out.println(numbers);
    }
}
