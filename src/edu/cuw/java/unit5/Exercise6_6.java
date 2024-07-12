package edu.cuw.java.unit5;

public class Exercise6_6 {

    public static void main(String[] args){

        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(28);
        bt.add(40);
        bt.add(14);
        bt.add(3);
        bt.add(10);
        bt.add(42);
        bt.add(4);
        bt.add(15);
        bt.add(35);
        bt.add(23);
        bt.add(48);
        bt.add(26);
        bt.add(8);
        bt.add(7);
        bt.add(38);
        bt.add(6);
        bt.add(19);
        bt.add(3);
        bt.add(11);
        bt.add(13);
        bt.add(27);
        bt.add(16);
        bt.add(20);
        bt.add(50);

        System.out.println("Is Balanced? " + bt.isBalanced());

        BinaryTree<Integer> bt2 = new BinaryTree<>();
        bt2.add(36);
        bt2.add(2);
        bt2.add(4);
        bt2.add(5);
        bt2.add(1);
        bt2.add(6);
        bt2.add(7);
        bt2.add(9);
        bt2.add(8);
        bt2.add(15);
        bt2.add(6);
        bt2.add(19);
        bt2.add(3);
        bt2.add(11);
        bt2.add(13);
        bt2.add(16);
        bt2.add(20);

        System.out.println("Is Balanced? " + bt2.isBalanced());

        BinaryTree<Integer> bt3 = new BinaryTree<>();
        bt3.add(6);
        bt3.add(2);
        bt3.add(4);

        System.out.println("Is Balanced? " + bt3.isBalanced());
    }

}
