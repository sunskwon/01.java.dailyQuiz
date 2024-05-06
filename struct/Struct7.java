package com.ohgiraffers.struct;

public class Struct7 implements Comparable<Struct7>{

    private int no;
    private String name;
    private int order;

    public Struct7() {}

    public Struct7(int no, String name, int order) {
        this.no = no;
        this.name = name;
        this.order = order;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Struct7{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Struct7 struct7) {
        if (struct7.no > no) {
            return -1;
        } else if (struct7.no == no) {
            if (struct7.order > order) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }
}
