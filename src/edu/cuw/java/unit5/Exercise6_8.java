package edu.cuw.java.unit5;

public class Exercise6_8 {

    public static void main(String[] args){

        SubBinaryTree<Integer> sbt = new SubBinaryTree<>();

        sbt.r.setX(8);

        sbt.r.setLeft(new SubBTNode<>(10));
        sbt.r.getLeft().setParent(sbt.r);

        sbt.r.setRight(new SubBTNode<>(13));
        sbt.r.getRight().setParent(sbt.r);

        sbt.r.getLeft().setLeft(new SubBTNode<>(22));
        sbt.r.getLeft().getLeft().setParent(sbt.r.getLeft());

        sbt.r.getLeft().setRight(new SubBTNode<>(28));
        sbt.r.getLeft().getRight().setParent(sbt.r.getLeft());

        sbt.r.getRight().setLeft(new SubBTNode<>(37));
        sbt.r.getRight().getLeft().setParent(sbt.r.getRight());

        sbt.r.getRight().setRight(new SubBTNode<>(56));
        sbt.r.getRight().getRight().setParent(sbt.r.getRight());

        System.out.println("Preorder Numbers: " + sbt.preOrderNumber(sbt.r));

        System.out.println("\nCurrent Preorder Number: " + sbt.r.getLeft().getLeft().getX());

        System.out.println("\nNext Preorder Number: " + sbt.nextPreOrderNumber(sbt.r.getLeft().getLeft()).getX());

        System.out.println("\nInorder Numbers: " + sbt.inOrderNumber(sbt.r));

        System.out.println("\nCurrent Inorder Number: " + sbt.r.getRight().getX());

        System.out.println("\nNext Inorder Number: " + sbt.nextInOrderNumber(sbt.r.getRight()).getX());

        System.out.println("\nPostorder Numbers: " + sbt.postOrderNumber(sbt.r));

        System.out.println("\nCurrent Postorder Number: " + sbt.r.getRight().getLeft().getX());

        System.out.println("\nNext Postorder Number: " + sbt.nextPostOrderNumber(sbt.r.getRight().getLeft()).getX());
    }

}
