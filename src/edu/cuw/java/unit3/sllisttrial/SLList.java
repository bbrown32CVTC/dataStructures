package edu.cuw.java.unit3.sllisttrial;

public class SLList<T> {
    private NodeList<T> head = new NodeList<>();
    private NodeList<T> tail = new NodeList<>();
    private int n = 0;

    public SLList() {
    }

    public T get(int i) {
        T x = null;
        int count = 0;

        if (n == 0) {
            return null;
        }

        NodeList<T> holder = this.head;

        while (holder != null) {
            if (count == i) {
                x = holder.getElement();
                break;
            }

            count++;
            holder = holder.getNext();
        }

        return x;
    }

    public void set(int i, T x) {
        int count = 0;

        if (i > n) {
            throw new NullPointerException();
        }

        if (i == 0) {
            this.head.setElement(x);

        } else {

            NodeList<T> headHolder = new NodeList<>();
            NodeList<T> tailHolder = new NodeList<>();

            while (this.head != null) {
                if (count == i) {
                    NodeList<T> u = new NodeList<>();
                    u.setElement(x);
                    tailHolder.setNext(u);
                    tailHolder = u;

                } else {
                    NodeList<T> u = new NodeList<>();
                    u.setElement(this.head.getElement());
                    if (count == 0) {
                        headHolder= u;
                    } else {
                        tailHolder.setNext(u);
                    }
                    tailHolder = u;
                    }

                this.head = head.getNext();
                count++;
            }

            this.head = headHolder;

        }

    }

    public T add(int i, T x) {
        int count = 0;

        if (i > n) {
            throw new NullPointerException();
        }

        NodeList<T> headHolder = new NodeList<>();
        NodeList<T> tailHolder = new NodeList<>();

        while (this.head != null) {
            if (count == i) {
                NodeList<T> u = new NodeList<>();
                NodeList<T> w = new NodeList<>();
                u.setElement(x);
                w.setElement(this.head.getElement());
                u.setNext(w);
                tailHolder.setNext(u);
                tailHolder = w;

            } else {
                NodeList<T> u = new NodeList<>();
                u.setElement(this.head.getElement());
                if (count == 0) {
                    headHolder= u;
                } else {
                    tailHolder.setNext(u);
                }
                tailHolder = u;
            }

            this.head = head.getNext();
            count++;
        }

        this.head = headHolder;

        n++;
        return x;
    }

    public T add(T x) {
        NodeList<T> u = new NodeList<>();
        u.setElement(x);
        if (n == 0) {
            this.head = u;
        } else {
            this.tail.setNext(u);
        }
        this.tail = u;

        n++;
        return x;
    }

    public T push(T x) {
        NodeList<T> u = new NodeList<>();
        u.setElement(x);
        u.setNext(this.head);
        this.head = u;
        if (n == 0) {
            this.tail = u;
        }

        n++;
        return x;
    }

    public T pop() {
        if (n == 0) {
            return null;
        }

        T x = this.head.getElement();
        this.head = this.head.getNext();

        if (--n == 0) {
            this.tail = null;
        }

        n--;
        return x;
    }

    public T remove() {
        if (n == 0) {
            return null;
        }

        T x = this.head.getElement();
        this.head = this.head.getNext();

        if (--n == 0) {
            this.tail = null;
        }

        n--;
        return x;
    }

    public void remove(int i) {
        if (n == 0) {
            throw new NullPointerException();
        }

        int count = 0;

        if (i > n) {
            throw new NullPointerException();
        }

        NodeList<T> headHolder = new NodeList<>();
        NodeList<T> tailHolder = new NodeList<>();

        while (this.head != null) {
            if (count != i) {
                NodeList<T> u = new NodeList<>();
                u.setElement(this.head.getElement());
                if (count == 0) {
                    headHolder= u;
                } else {
                    tailHolder.setNext(u);
                }
                tailHolder = u;
            }

            this.head = this.head.getNext();
            count++;
        }

        this.head = headHolder;

        n--;
    }

    public T secondLast() {
        T x = null;

        if (this.head.getElement() == null) {
            return null;
        } else if (this.head.getNext() == null) {
            return this.head.getElement();
        } else {
            NodeList<T> holder = this.head;

            while (holder != null) {
                if (holder.getNext().getNext() == null) {
                    x = holder.getElement();
                    break;
                }

                holder = holder.getNext();
            }
        }

        return x;
    }

    public int size() {
        return n;
    }

    public void reverse() {
        int count = 0;
        if (n > 1) {
            NodeList<T> previous = null;
            NodeList<T> current = this.head;
            NodeList<T> next;

            while (current!= null) {
                next = current.getNext();
                current.setNext(previous);
                previous = current;
                current = next;
            }

            this.head = previous;
        }
    }

    public void checkSize() {
        int count = 0;

        NodeList<T> holder = this.head;

        while (holder != null) {
            count++;

            if (holder.getNext() == null) {
                break;
            }
            holder = holder.getNext();
        }

        if (count != (n)) {
            throw new IllegalStateException("Amount of nodes does not match value of n.");
        }
    }

    public void changeCount(int number) {
        n = n + number;
    }

    @Override
    public String toString() {
        NodeList<T> currentNode = this.head;
        StringBuilder comment = new StringBuilder("[");

        if (this.head == null) {
            return "Empty list";
        }

        while (currentNode != null) {
            comment.append(currentNode.getElement());
            if (currentNode.getNext() != null) {
                comment.append(",");
            }
            currentNode = currentNode.getNext();
        }

        comment.append("]");
        return comment.toString();
    }
}
