package edu.cuw.java.unit3.sllisttrial;

public class Exercise3_5 {

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

        sll.checkSize();

        System.out.println("Size: " + sll.size());

        sll.changeCount(4);
        System.out.println("New Size: " + sll.size());
        sll.checkSize();
    }
}
