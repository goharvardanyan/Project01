package com.aca.homeworks.week3.day1;

public class LinkedIntBuffer extends IntBuffer {

    private LinkedIntBuffer next;

    public LinkedIntBuffer(int value) {
        this(value, null);
    }

    public LinkedIntBuffer(int value, LinkedIntBuffer next) {
        super(value);
        this.next = next;
    }

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    public String toString() {
        LinkedIntBuffer linkedIntBuffer = this;
        StringBuilder sb = new StringBuilder();
        do {
            sb
                    .append(linkedIntBuffer.getValue())
                    .append("->");
            linkedIntBuffer = linkedIntBuffer.getNext();
        }
        while (linkedIntBuffer != null);
        sb.append("null");
        return sb.toString();
    }


}
