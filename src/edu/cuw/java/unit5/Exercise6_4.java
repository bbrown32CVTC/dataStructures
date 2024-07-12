package edu.cuw.java.unit5;

public class Exercise6_4 {

    public static void main(String[] args){

        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(14);
        bt.add(2);
        bt.add(28);
        bt.add(74);
        bt.add(1);
        bt.add(5);
        bt.add(13); // Duplicate Add Test
        bt.add(91);

        System.out.println("Size of tree with root at r: " + bt.size2());

        System.out.println("Size of subtree with root at node: " + bt.size2(15));

    }

}
