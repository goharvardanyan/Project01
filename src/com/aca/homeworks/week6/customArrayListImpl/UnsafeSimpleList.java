package com.aca.homeworks.week6.customArrayListImpl;

public class UnsafeSimpleList<T> implements SimpleList<T> {
    private final int capacity = 10000;
    private final Object[] list = new Object[capacity];
    private int size = 0;

    @Override
    public void add(T item) {
        if (size == capacity) {
            throw new RuntimeException("List is full");
        }
        list[size++] = item;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) list[index];
    }
}
