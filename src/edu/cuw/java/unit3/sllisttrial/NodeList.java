package edu.cuw.java.unit3.sllisttrial;

public class NodeList<T> {
    private T x;
    private NodeList<T> next;
    private NodeList<T> previous;

    public NodeList() {
    }

    public NodeList(T y) {
        setElement(y);
        this.next = null;
        this.previous = null;
    }

    public NodeList(T x, NodeList<T> next, NodeList<T> previous) {
        this.x = x;
        this.next = next;
        this.previous = previous;
    }

    public T getElement() {
        return this.x;
    }

    public void setElement(T x) {
        this.x = x;
    }

    public NodeList<T> getNext() {
        return this.next;
    }

    public void setNext(NodeList<T> next) {
        this.next = next;
    }

    public NodeList<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(NodeList<T> previous) {
        this.previous = previous;
    }
}
