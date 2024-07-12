package edu.cuw.java.unit3.sllisttrial;

public class DLList<T> {
    private int n = 0;
    NodeList<T> dummy;

    public DLList() {
        this.dummy = new NodeList<>();
        this.dummy.setNext(this.dummy);
        this.dummy.setPrevious(this.dummy);
    }

    public NodeList<T> getNode(int i) {
        NodeList<T> p;

        if (i < n/2) {
        p = this.dummy.getNext();

        for (int j = 0; j < i; j++) {
            p = p.getNext();
        }

        }else {
            p = dummy;
            for (int j = n; j > i; j--) {
                p = p.getPrevious();
            }
        }

        return p;
    }

    public T get(int i) {
        return getNode(i).getElement();
    }

    public T set(int i, T x) {
        NodeList<T> u = getNode(i);
        T y = u.getElement();
        u.setElement(x);

        return y;
    }

    /*
    public NodeList<T> addBefore(NodeList<T> w, T x){
        NodeList<T> u = new NodeList<>();
        u.setElement(x);
        u.setPrevious(w.getPrevious());
        u.setNext(w);
        u.getNext().setPrevious(u);
        u.getPrevious().setNext(u);
        n++;

        return u;
    }
     */

    public NodeList<T> addBefore(NodeList<T> w, T x){
        NodeList<T> u = new NodeList<>();
        u.setElement(x);
        u.setPrevious(w.getPrevious());
        w.getPrevious().setNext(u);
        u.setNext(w);
        w.setPrevious(u);
        n++;

        return u;
    }

    public void add(int i, T x) {
        addBefore(getNode(i), x);
    }

    public void remove(NodeList<T> w) {
        w.getPrevious().setNext(w.getNext());
        w.getNext().setPrevious(w.getPrevious());

        n--;
    }

    public T remove(int i) {
        NodeList<T> w = getNode(i);
        remove(w);

        return w.getElement();
    }

    public void checkSize() {
        int count = 0;

        NodeList<T> holder = this.dummy;

        while (holder.getNext().getElement() != null) {
            count++;

            holder = holder.getNext();
        }

        if (count != n) {
            throw new IllegalStateException("Amount of nodes does not match value of n.");
        }
    }

    public void changeCount(int number) {
        n = n + number;
    }

    public int size() {
        return n;
    }

    @Override
    public String toString() {
        NodeList<T> currentNode = this.dummy;
        StringBuilder comment = new StringBuilder("[");

        if (currentNode.getNext().getElement() == null) {
            return "Empty list";
        }

        while (currentNode.getNext().getElement() != null) {
            comment.append(currentNode.getNext().getElement());

            currentNode = currentNode.getNext();
            if (currentNode.getNext().getElement() != null) {
                comment.append(",");
            }
        }

        comment.append("]");
        return comment.toString();
    }

    public String previousToString() {
        NodeList<T> currentNode = this.dummy;
        StringBuilder comment = new StringBuilder("[");

        if (currentNode.getPrevious().getElement() == null) {
            return "Empty list";
        }

        while (currentNode.getPrevious().getElement() != null) {
            comment.append(currentNode.getPrevious().getElement());

            currentNode = currentNode.getPrevious();
            if (currentNode.getPrevious().getElement() != null) {
                comment.append(",");
            }
        }

        comment.append("]");
        return comment.toString();
    }

}
