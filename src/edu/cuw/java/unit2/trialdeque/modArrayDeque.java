package edu.cuw.java.unit2.trialdeque;

import java.util.ArrayDeque;
import java.util.Arrays;

public class modArrayDeque<T> extends ArrayDeque<T> {
    private Object[] a = new Object[1];
    private int j = 0;
    private int n = 0;

    public modArrayDeque() {
    }

    public void add(int i, T x) {
        if ((n + 1) >= a.length && n != 0) {
            resize();
        }

        if (n == 0 || a[i] == null) {
            a[i] = x;

        } else {
            Object[] b = a.clone();
            a[i] = x;
            System.arraycopy(b, i, a, i + 1, n + 1);
        }

        n++;
    }

    public Object remove(int i) {

        if (n == 0 || a[i] == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object[] b = a.clone();
        System.arraycopy(b, i + 1, a, i, n - 1);

        n--;
        if (a.length >= 3*n) {
            resize();
        }

        return a[i];
    }

    public void resize() {
        Object[] b = new Object[Math.max(1, 2*n)];
        System.arraycopy(a, 0, b, 0, n);
        a = b.clone();
    }

    public int size() {
        return n + 1;
    }

    @Override
    public String toString() {

        Object[] s = new Object[n];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                s[i] = a[i];
            }

        }

        return Arrays.toString(s);
    }
}
