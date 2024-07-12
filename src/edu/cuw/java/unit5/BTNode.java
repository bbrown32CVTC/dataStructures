package edu.cuw.java.unit5;

public class BTNode<T extends  Comparable<T>> {
    private T x;
    private BTNode<T> left;
    private BTNode<T> right;
    private BTNode<T> parent;

    public BTNode() {
    }

    public BTNode(T x) {
        this.x = x;
    }

    public T getX() {
        return this.x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public BTNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public BTNode<T> getRight() {
        return this.right;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    public BTNode<T> getParent() {
        return this.parent;
    }

    public void setParent(BTNode<T> parent) {
        this.parent = parent;
    }
}
