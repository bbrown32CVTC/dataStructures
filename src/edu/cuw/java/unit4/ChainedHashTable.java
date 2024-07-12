package edu.cuw.java.unit4;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class ChainedHashTable<T> extends AbstractList<T> {
    List<T> t;
    int n = 0;

    public boolean add(T x) {
        if (find(x) != null) {
            return false;
        }

        if (this.n + 1 > t.size()) {
            //resize();
        }

        this.t.add(hash(x, x.hashCode()), x);
        n++;

        return true;
    }
    public T find(Object x) {
        T y;
        for (int i = 0; i < this.t.size(); i++) {
            y = this.t.get(x.hashCode());
            if (y.equals(x)) {
                return y;
            }
        }

        return null;
    }

    public int hash(Object x, int z) {

        return (z * x.hashCode());
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return this.n;
    }
}
