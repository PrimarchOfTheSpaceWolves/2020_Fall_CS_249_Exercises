package edu.realemj.Exercises17;

import java.util.ArrayList;

public class GenericQueue<E> {
    private ArrayList<E> list = new ArrayList<>();

    public GenericQueue() {}

    public int size() {
        return list.size();
    }

    public E peek() {
        if(list.size() > 0) {
            return list.get(0);
        }
        else {
            return null;
        }
    }

    public E dequeue() {
        if(list.size() > 0) {
            E item = list.get(0);
            list.remove(0);
            return item;
        }
        else {
            return null;
        }
    }

    public void enqueue(E item) {
        list.add(item);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }

    /*
    // compareTo does not work because E is too generic!
    public boolean compareToFirst(E other) {
        E first = list.get(0);
        return first.compareTo(other);
    }
     */
}
