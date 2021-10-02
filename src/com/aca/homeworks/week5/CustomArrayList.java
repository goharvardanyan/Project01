package com.aca.homeworks.week5;

import java.util.Arrays;
import java.util.Comparator;

public class CustomArrayList<T> {

    private static final int defaultCapacity = 10;
    private static final int MaximumCapacity = 1000;
    private Object[] array;

    private int size;

    public CustomArrayList() {
        this(defaultCapacity);
    }

    public CustomArrayList(int capacity) {
        array = new Object[capacity];
        size = 0;
    }


    public boolean addFirst(T t) {
        if (size == 0) {
            array[size++] = t;
        } else {
            ensureCapacity();
            for (int i = size; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = t;
        }
        return true;
    }

    public boolean addLast(T t) {
        ensureCapacity();
        array[size++] = t;
        return true;
    }

    public void add(int index, T t) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = t;
        size++;
    }

    private void ensureCapacity() {
        if (size == MaximumCapacity) {
            throw new RuntimeException("Array is full");
        } else if (size == array.length) {
            int length = Math.min(array.length * 2, MaximumCapacity);
//            int tempLength = array.length * 3 / 2;
//            if (tempLength > MaximumCapacity) {
//                tempLength = MaximumCapacity;
//            }
            Object[] tmp = new Object[length];
            System.arraycopy(array, 0, tmp, 0, array.length);
            array = tmp;
        }
    }

    public boolean remove(T t) {
        int index = indexOf(t);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Object temp = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return (T) temp;
    }

    public int indexOf(T t) {
        if (t == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(t)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public void bubbleSort(Comparator<? super T> c) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (c.compare((T) array[j], (T) array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }

        }
    }


    private void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
