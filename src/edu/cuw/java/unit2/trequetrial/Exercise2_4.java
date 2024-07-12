package edu.cuw.java.unit2.trequetrial;

public class Exercise2_4 {

    public static void main(String[] args) {
        Treque<Integer> treque = new Treque<>();
        treque.add(0, 11);
        treque.add(1, 10);
        treque.add(2, 9);
        treque.add(3, 8);
        treque.add(4, 7);
        treque.remove(2);
        treque.add(5, 6);
        treque.add(6, 5);
        treque.add(7, 4);
        treque.add(8, 3);
        treque.remove(4);
        treque.add(9, 2);
        treque.add(10, 1);
        treque.add(2, 20);
        treque.add(4, 30);


        System.out.println(treque);
    }
}
