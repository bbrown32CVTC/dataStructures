package edu.cuw.java.unit5;

public class Exercise6_7 {

    public static void main(String[] args){

        SubBinaryTree<Integer> sbt = new SubBinaryTree<>();

        sbt.r.setX(8);
        sbt.r.setLeft(new SubBTNode<>(10));
        sbt.r.setRight(new SubBTNode<>(13));
        sbt.r.getLeft().setLeft(new SubBTNode<>(22));
        sbt.r.getLeft().setRight(new SubBTNode<>(28));
        sbt.r.getRight().setLeft(new SubBTNode<>(37));
        sbt.r.getRight().setRight(new SubBTNode<>(56));

        System.out.println("Preorder Numbers: " + sbt.preOrderNumber(sbt.r));

        System.out.println("Inorder Numbers: " + sbt.inOrderNumber(sbt.r));

        System.out.println("Postorder Numbers: " + sbt.postOrderNumber(sbt.r));
    }

}
