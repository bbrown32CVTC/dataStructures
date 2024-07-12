package edu.cuw.java.unit2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exercise2_3 {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        System.out.println("Numbers List: " + numbers);

        randomQueue(numbers);

        System.out.println("First Removal. Number List: " + numbers);

        randomQueue(numbers);

        System.out.println("Second Removal. Number List: " + numbers);

        randomQueue(numbers);

        System.out.println("Third Removal. Number List: " + numbers);

        randomQueue(numbers);

        System.out.println("Fourth Removal. Number List: " + numbers);

    }

    public static void randomQueue(Queue<Integer> queue) {
        int number = 0;
        int count = 0;

        if (queue != null && !queue.isEmpty()) {

            Random random = new Random();
            int randomIndex = random.nextInt(queue.size());

            for (Integer i : queue) {
                if (randomIndex == count) {
                    number = i;
                    break;
                }
                count++;
            }

            queue.remove(number);

        } else {
            throw new IllegalStateException("Queue cannot be null or empty.");
        }

    }

}
