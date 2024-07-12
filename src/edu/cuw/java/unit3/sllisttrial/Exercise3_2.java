package edu.cuw.java.unit3.sllisttrial;

/**
 * This is for Exercises 3.2 - 3.4
 */


public class Exercise3_2 {

    public static void main(String[] args) {

        SLList<Integer> sll = new SLList<>();
        sll.push(0);
        sll.add(1);
        sll.push(2);
        sll.add(3);
        sll.push(4);
        sll.add(5);
        sll.push(6);
        System.out.println("SLL: " + sll);

        sll.remove();
        System.out.println("First New SLL: " + sll);

        sll.set(3, 12);
        System.out.println("Second New SLL: " + sll);

        sll.add(3, 8);
        System.out.println("Third SLL: " + sll);

        sll.remove(4);
        System.out.println("Fourth SLL: " + sll);

        sll.reverse();
        System.out.println("SLL Reversed: " + sll);
    }
}
