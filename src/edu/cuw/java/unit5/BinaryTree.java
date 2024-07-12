package edu.cuw.java.unit5;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    BTNode<T> r = new BTNode<>();

    public BinaryTree() {
    }

    public boolean add(T x) {
        if (this.r.getX() == null) {
            this.r.setX(x);
            return true;

        } else if (this.r.getLeft() == null) {
            BTNode<T> u = new BTNode<T>(x);
            u.setParent(this.r);
            this.r.setLeft(u);
            return true;

        } else if (this.r.getRight() == null) {
            BTNode<T> u = new BTNode<T>(x);
            u.setParent(this.r);
            this.r.setRight(u);
            return true;

        } else {
            BTNode<T> p = findLast(x);
            return addChild(p, new BTNode<>(x));
        }
    }

    public boolean addChild(BTNode<T> p, BTNode<T> u) {
        if(p == null) {
            this.r = u;

        } else {
            int comp = p.getX().compareTo(u.getX());
            if (comp < 0) {
                p.setLeft(u);

            } else if (comp > 0) {
                p.setRight(u);

            } else {
                return false;
            }

            u.setParent(p);
        }

        return true;
    }

    public BTNode<T> findLast(T x) {
        BTNode<T> w = r, prev = null;

        while (w != null) {
            prev = w;
            int comp = w.getX().compareTo(x);

            if (comp < 0) {
                w = w.getLeft();

            } else if (comp > 0) {
                w = w.getRight();

            } else {
                return w;
            }
        }

        return prev;
    }

    public int depth(BTNode<T> u) {
        int d = 0;

        while (u != this.r) {
            u = u.getParent();
            d++;
        }
        return d;
    }

    public int size(BTNode<T> u) {
        if (u == null) {
            return 0;
        }

        return (1 + size(u.getLeft()) + size(u.getRight()));
    }

    public int size2() {
        BTNode<T> u = this.r, prev = null, next;
        int n = 0;

        while (u != null) {

            if (prev == u.getParent()) {
                n++;

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

        return n;
    }

    public int size2(T x) {
        BTNode<T> u = this.r, prev = null, next = null, t = null;
        int n = 0;
        boolean found = false;

        while (u != null) {


            int comp = u.getX().compareTo(x);

            if (comp == 0) {
                found = true;
            }

            if (prev == u.getParent()) {
                if (found) {
                    n++;
                }

                if (u.getLeft() != null) {
                    next = u.getLeft();


                } else if (u.getRight() != null) {
                    next = u.getRight();

                } else {
                    next = u.getParent();
                    found = false;
                }

            } else if (prev == u.getLeft()) {

                if (u.getRight() != null) {
                    next = u.getRight();
                    if (found) {
                        n++;
                    }

                } else {
                    next = u.getParent();
                    found = false;
                }

            } else {
                next = u.getParent();
                found = false;
            }

            prev = u;
            u = next;
        }

        return n;
    }

    public int height(BTNode<T> u) {
        if (u == null) {
            return -1;
        }

        return (1 + Math.max(height(u.getLeft()), height(u.getRight())));
    }

    public int height2(T x) {
        BTNode<T> u = this.r, prev = null, next = null, t = null;
        int n = 0;

        while (u != null) {


            int comp = u.getX().compareTo(x);

            if (comp == 0) {
                Queue<BTNode<T>> q = new LinkedList<BTNode<T>>();
                q.add(u);

                while (!q.isEmpty()) {

                    t = q.remove();

                    if (q.size() == 1) {
                        n++;

                    } else if (t.getLeft() != null && t.getRight() == null) {
                        n++;

                    } else if (t.getLeft() == null && t.getRight() != null) {
                        n++;
                    }

                    if (t.getLeft() != null) {
                        q.add(t.getLeft());
                    }

                    if (t.getRight() != null) {
                        q.add(t.getRight());
                    }

                }

                 return n-1;
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

        return n;

    }

    public void traverse(BTNode u) {
        if (u == null) {
            return;
        }

        traverse(u.getLeft());
        traverse(u.getRight());
    }

    public void traverse2() {
        BTNode u = this.r, prev = null, next;

        while (u != null) {
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

    }

    public boolean isBalanced() {
        return ((size(this.r.getLeft()) - size(this.r.getRight())) >= 0 && (size(this.r.getLeft()) - size(this.r.getRight())) <= 1);
    }


}
