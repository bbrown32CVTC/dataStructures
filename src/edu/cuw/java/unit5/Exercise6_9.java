package edu.cuw.java.unit5;

public class Exercise6_9 {

    public static void main(String[] args){

        SubBinaryTree<Integer> sbt = new SubBinaryTree<>();

        sbt.r.setX(1);

        sbt.r.setLeft(new SubBTNode<>(2));
        sbt.r.getLeft().setParent(sbt.r);

        sbt.r.setRight(new SubBTNode<>(3));
        sbt.r.getRight().setParent(sbt.r);

        sbt.r.getLeft().setLeft(new SubBTNode<>(4));
        sbt.r.getLeft().getLeft().setParent(sbt.r.getLeft());

        sbt.r.getLeft().setRight(new SubBTNode<>(5));
        sbt.r.getLeft().getRight().setParent(sbt.r.getLeft());

        sbt.r.getRight().setLeft(new SubBTNode<>(6));
        sbt.r.getRight().getLeft().setParent(sbt.r.getRight());

        sbt.r.getRight().setRight(new SubBTNode<>(7));
        sbt.r.getRight().getRight().setParent(sbt.r.getRight());

        System.out.println("Preorder Numbers: " + sbt.preOrderNumber(sbt.r));

        System.out.println("\nInorder Numbers: " + sbt.inOrderNumber(sbt.r));

        System.out.println("\nPostorder Numbers: " + sbt.postOrderNumber(sbt.r));

        System.out.println("\nSubtree Depth: " + sbt.depth(sbt.r.getLeft().getRight()));

        System.out.println("\nLeftside Subtree Size Recursive: " + sbt.size(sbt.r.getLeft()));

        System.out.println("\nLeftside Subtree Size: " + sbt.size3(sbt.r.getLeft()));

        System.out.println("\nRightside Subtree Size Recursive: " + sbt.size(sbt.r.getRight()));

        System.out.println("\nRightside Subtree Size: " + sbt.size3(sbt.r.getRight()));

        System.out.println("\nLineage 1: ");
        sbt.lineage(sbt.r, sbt.r.getLeft().getRight());

        System.out.println("\nLineage 2: ");
        sbt.lineage(sbt.r.getRight(), sbt.r.getLeft().getRight());
    }

}
