package edu.cuw.java.unit5;

public class Exercise6_5 {

    public static void main(String[] args){

        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(2);
        bt.add(5);
        bt.add(7);
        bt.add(8);
        bt.add(15);
        bt.add(6);
        bt.add(8); // Duplicate Add Test
        bt.add(19);
        bt.add(3);
        bt.add(11);
        bt.add(13);
        bt.add(16);
        bt.add(20);

        System.out.println("Height at node r: " + bt.height(bt.r));

        System.out.println("Height at node r using height2(u) method: " + bt.height2(2));

        System.out.println("Height at node u: " + bt.height2(15));

    }

}
