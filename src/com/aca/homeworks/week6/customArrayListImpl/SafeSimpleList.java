package com.aca.homeworks.week6.customArrayListImpl;

public class SafeSimpleList<T> implements SimpleList<T> {

    private final int capacity = 10000;
    private final Object[] list = new Object[capacity];
    private int size = 0;

    @Override
    public synchronized void add(T item) {
        if (size == capacity) {
            throw new RuntimeException("List is full");
        }
        list[size++] = item;
    }

    @Override
    public synchronized int getSize() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public synchronized T get(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) list[index];
    }
}
