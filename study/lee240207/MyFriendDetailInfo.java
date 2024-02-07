package com.ohgiraffers.study.lee240207;

public class MyFriendDetailInfo extends MyFriendInfo {

    private String adress;
    private String phoneNum;

    public MyFriendDetailInfo() {

        }

    public MyFriendDetailInfo(String adrees, String phoneNum) {

        this.adress = adrees;
        this.phoneNum = phoneNum;
    }

    public MyFriendDetailInfo(String name, int age, String adress, String phoneNum) {

        super(name, age);

        this.adress = adress;
        this.phoneNum = phoneNum;

        System.out.println("MyFriendDetailInfo의 매개변수 있는 생성자 불러옴");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "MyFriendDetailInfo{" +
                "adress='" + adress + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
