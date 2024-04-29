package com.ohgiraffers.struct;

public class Struct2 implements Comparable<Struct2> {

    private int order;
    private int value;

    public Struct2 () {}

    public Struct2(int order, int value) {
        this.order = order;
        this.value = value;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOrder() {
        return order;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Struct2{" +
                "order=" + order +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Struct2 struct2) {
        if (struct2.value < value) {
            return 1;
        } else if (struct2.value > value) {
            return -1;
        }
        return 0;
    }
}
