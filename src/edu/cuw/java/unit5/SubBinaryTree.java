package edu.cuw.java.unit5;

import java.util.LinkedList;
import java.util.Queue;

public class SubBinaryTree<T extends Comparable<T>> extends BinaryTree<T> {
    SubBTNode<T> r = new SubBTNode<>();
    Queue<T> pre = new LinkedList<T>();
    Queue<T> in = new LinkedList<T>();
    Queue<T> post = new LinkedList<T>();
    int preN = 0;
    int inN = 0;
    int postN = 0;

    public SubBinaryTree() {
    }

    public Queue<T> preOrderNumber(SubBTNode<T> u) {
        if (u == null) {
            return this.pre;
        }

        this.preN++;
        u.setPreOrderNum(this.preN - 1);
        this.pre.add(u.getX());
        preOrderNumber(u.getLeft());
        preOrderNumber(u.getRight());

        return new LinkedList<>(this.pre);
    }

    public Queue<T> inOrderNumber(SubBTNode<T> u) {
        if (u == null) {
            return this.in;
        }

        inOrderNumber(u.getLeft());
        this.inN++;
        u.setInOrderNum(this.inN - 1);
        this.in.add(u.getX());
        inOrderNumber(u.getRight());

        return new LinkedList<>(this.in);
    }

    public Queue<T> postOrderNumber(SubBTNode<T> u) {
        if (u == null) {
            return this.post;
        }

        postOrderNumber(u.getLeft());
        postOrderNumber(u.getRight());
        this.postN++;
        u.setPostOrderNum(this.postN - 1);
        this.post.add(u.getX());

        return new LinkedList<>(this.post);
    }

    public SubBTNode<T> nextPreOrderNumber(SubBTNode<T> t) {
        if (t == null) {
            return null;
        }
        preOrderNumber(this.r);
        int nextPre = t.getPreOrderNum() + 1;

        SubBTNode<T>  u = this.r, prev = null, next = null;

        while (u != null) {

            if (u.getPreOrderNum() == nextPre) {
                return u;
            }

            if (prev == u.getParent()) {

                if (u.getLeft() != null) {
                    next = u.getLeft();

                } else if (u.getRight() != null) {
                    next = u.getRight();

                } else {
                    next = u.getParent();
                }

            } else if (prev == u.getLeft()) {

                if (u.getRight() != null) {
                    next = u.getRight();
                } else {
                    next = u.getParent();
                }

            } else {
                next = u.getParent();
            }

            prev = u;
            u = next;
        }

        return null;
    }

    public SubBTNode<T> nextInOrderNumber(SubBTNode<T> t) {
        if (t == null) {
            return null;
        }

        inOrderNumber(this.r);
        int nextIn = t.getInOrderNum() + 1;

        SubBTNode<T>  u = this.r, prev = null, next = null;

        while (u != null) {

            if (u.getInOrderNum() == nextIn) {
                return u;
            }

            if (prev == u.getParent()) {

                if (u.getLeft() != null) {
                    next = u.getLeft();

                } else if (u.getRight() != null) {
                    next = u.getRight();

                } else {
                    next = u.getParent();
                }

            } else if (prev == u.getLeft()) {

                if (u.getRight() != null) {
                    next = u.getRight();
                } else {
                    next = u.getParent();
                }

            } else {
                next = u.getParent();
            }

            prev = u;
            u = next;
        }

        return null;
    }

    public SubBTNode<T> nextPostOrderNumber(SubBTNode<T> t) {
        if (t == null) {
            return null;
        }

        postOrderNumber(this.r);
        int nextPost = t.getPostOrderNum() + 1;

        SubBTNode<T>  u = this.r, prev = null, next = null;

        while (u != null) {

            if (u.getPostOrderNum() == nextPost) {
                return u;
            }

            if (prev == u.getParent()) {

                if (u.getLeft() != null) {
                    next = u.getLeft();

                } else if (u.getRight() != null) {
                    next = u.getRight();

                } else {
                    next = u.getParent();
                }

            } else if (prev == u.getLeft()) {

                if (u.getRight() != null) {
                    next = u.getRight();
                } else {
                    next = u.getParent();
                }

            } else {
                next = u.getParent();
            }

            prev = u;
            u = next;
        }

        return null;
    }

    public int depth(SubBTNode<T> u) {
        if (u == null) {
            return 0;
        }

        Queue<T> t;

        if (this.post.isEmpty()) {
            t = postOrderNumber(this.r);
        } else {
            this.post = new LinkedList<>();
            t = postOrderNumber(this.r);
        }

        int n = 0;

        while (!t.isEmpty()) {
            if (t.peek() == (u.getParent().getX())) {
                n++;
                u = u.getParent();
            }

            t.remove();
        }

        return n;
    }

    public int size3(SubBTNode<T> u) {
        if (u == null) {
            return 0;

        } else if (u.getLeft() == null && u.getRight() == null) {
            return 1;
        }

        Queue<T> q = new LinkedList<T>();
        Queue<T> t;
        boolean found = false;

        if (this.post.isEmpty()) {
            t = postOrderNumber(this.r);
        } else {
            this.post = new LinkedList<>();
            t = postOrderNumber(this.r);

        }

        int n = 0;
        int parent = 0;

        while (!t.isEmpty()) {

            if (t.peek() == u.getX()) {
                n++;
                break;

            } else if (t.peek() == r.getLeft().getX() && !found) {
                n = 0;

            } else {
                n++;
            }

            t.remove();
        }

        return n;
    }

    public void lineage(SubBTNode<T> u, SubBTNode<T> w) {
        if (u == null || w == null) {
            return;
        }

        if (this.pre.isEmpty()) {
            preOrderNumber(this.r);
        } else {
            this.pre = new LinkedList<>();
            preOrderNumber(this.r);
        }

        if (this.post.isEmpty()) {
            postOrderNumber(this.r);
        } else {
            this.post = new LinkedList<>();
            postOrderNumber(this.r);

        }

        if (u.getPreOrderNum() > w.getPreOrderNum() && u.getPostOrderNum() < w.getPostOrderNum()) {
            System.out.println("U is an ancestor of W.");

        } else if (u.getPreOrderNum() < w.getPreOrderNum() && u.getPostOrderNum() > w.getPostOrderNum()) {
            System.out.println("W is an ancestor of U.");

        } else {
            System.out.println("Neither U or W are an ancestor of each other.");
        }

    }

}
