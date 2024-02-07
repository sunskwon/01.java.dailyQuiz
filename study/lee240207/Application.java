package com.ohgiraffers.study.lee240207;

public class Application {

    public static void main(String[] args) {

        /* 친구정보를 기록할 MyFriendInfo클래스를
        상세정보를 기록할 MyFriendDetailInfo클래스에 상속하고
        이름 나이는 MyFriendInfo클래스에
        주소와 번호는 MyFiendDetailInfo에 입력할 수 있도록 구성하시오

        출력 예시

        이름 : 이순신
        나이 : 100
        주소 : 성균관
        전화 : 010-1000-8888
         */

        MyFriendDetailInfo mfdi = new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
        System.out.println(mfdi.toString());
    }
}
