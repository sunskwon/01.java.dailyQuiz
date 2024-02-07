package com.ohgiraffers.study.lee240207;

public class MyFriendInfo {

    private String name;
    private int age;

    public MyFriendInfo() {

    }

    public MyFriendInfo(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("MyFriendInfo의 매개변수 있는 생성자 불러옴");
    }

    @Override
    public String toString() {
        return "MyFriendInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
