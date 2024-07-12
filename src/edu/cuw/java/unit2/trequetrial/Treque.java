package edu.cuw.java.unit2.trequetrial;

import java.util.*;

public class Treque<T> extends AbstractList<T> {
    ArrayList<T> front = new ArrayList<>();
    ArrayList<T> middle = new ArrayList<>();
    ArrayList<T> back = new ArrayList<>();

    public void add(int i, T x) {
        if (i < front.size() || front.isEmpty()) {
            //Adds new element to front
            if (front.isEmpty()) {
                front.add(x);
            } else {
                front.add(i, x);
            }

        } else if (i < front.size() + middle.size()) {
            //Adds new element to middle
            if (middle.isEmpty()) {
                middle.add(x);
            } else {
                middle.add((i - front.size()), x);
            }

        } else {
            //Adds new element to back
            back.add(x);
        }

        balance();
    }

    public T remove(int i) {
        T x;
        int n = size();

        if (n == 0) {
            throw new NoSuchElementException();
        }

        if (i < front.size()) {
            //Grabs from the front
            x = front.remove(i);

        } else if (i < front.size() + middle.size()) {
            //Grabs from the middle
            x = middle.remove((i - front.size()));

        } else {
            //Grabs from the back
            x = back.remove((i - front.size() - middle.size()));
        }

        balance();

        return x;
    }

    @Override
    public T get(int i) {
        if (i < front.size()) {
            //Grabs from the front
            return front.get(i);

        } else if (i < front.size() + middle.size()) {
            //Grabs from the middle
            return middle.get(i - front.size());

        } else {
            //Grabs from the back
            return back.get(i - front.size() - middle.size());
        }

    }

    public T set(int i, T x) {
        if (i < front.size()) {
            //Grabs from the front
            return front.set(i, x);

        } else if (i < front.size() + middle.size()) {
            //Grabs from the middle
            return middle.set((i - front.size()), x);

        } else {
            //Grabs from the back
            return back.set((i - front.size() - middle.size()), x);
        }
    }

    @Override
    public int size() {
        return front.size() + middle.size() + back.size();
    }

    public void balance() {
        int n = size();
        int s = 0;

        if (2 * front.size() < middle.size()) {
            s = n/2 - front.size();
            ArrayList<T> l1 = new ArrayList<>();
            ArrayList<T> l2 = new ArrayList<>();
            l1.addAll(front);
            l1.addAll(middle.subList(0, s));
            l2.addAll(middle.subList(s, middle.size()));
            front = l1;
            middle = l2;

        }  else if (2 * middle.size() < back.size()) {
            s = n/2 - middle.size();
            ArrayList<T> l1 = new ArrayList<>();
            ArrayList<T> l2 = new ArrayList<>();
            l1.addAll(middle);
            l1.addAll(back.subList(0, s));
            l2.addAll(back.subList(s, back.size()));
            middle = l1;
            back = l2;

        } else if (2 * middle.size() < front.size() && front.size() > 2) {
            s = front.size() - n/2;
            ArrayList<T> l1 = new ArrayList<>();
            ArrayList<T> l2 = new ArrayList<>();
            l1.addAll(front.subList(s, front.size()));
            l2.addAll(front.subList(0, s));
            l2.addAll(middle);
            middle = l1;
            front = l2;

        } else if (2 * back.size() < middle.size() && middle.size() > 2) {
            s = middle.size() - n/2;
            ArrayList<T> l1 = new ArrayList<>();
            ArrayList<T> l2 = new ArrayList<>();
            l1.addAll(middle.subList(s, middle.size()));
            l2.addAll(middle.subList(0, s));
            l2.addAll(back);
            back = l1;
            middle = l2;
        }


    }

}
