package edu.cuw.java.unit5;

public class SubBTNode<T extends Comparable<T>> extends BTNode<T> {
    private T x;
    private SubBTNode<T> left;
    private SubBTNode<T> right;
    private SubBTNode<T> parent;
    int preOrderNum;
    int inOrderNum;
    int postOrderNum;

    public SubBTNode() {
    }

    public SubBTNode(T x) {
        this.x = x;
    }

    @Override
    public T getX() {
        return this.x;
    }

    @Override
    public void setX(T x) {
        this.x = x;
    }

    @Override
    public SubBTNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(SubBTNode<T> left) {
        this.left = left;
    }

    @Override
    public SubBTNode<T> getRight() {
        return this.right;
    }

    public void setRight(SubBTNode<T> right) {
        this.right = right;
    }

    @Override
    public SubBTNode<T> getParent() {
        return this.parent;
    }

    public void setParent(SubBTNode<T> parent) {
        this.parent = parent;
    }

    public int getPreOrderNum() {
        return this.preOrderNum;
    }

    public void setPreOrderNum(int preOrderNum) {
        this.preOrderNum = preOrderNum;
    }

    public int getInOrderNum() {
        return this.inOrderNum;
    }

    public void setInOrderNum(int inOrderNum) {
        this.inOrderNum = inOrderNum;
    }

    public int getPostOrderNum() {
        return this.postOrderNum;
    }

    public void setPostOrderNum(int postOrderNum) {
        this.postOrderNum = postOrderNum;
    }
}
