package com.ohgiraffers.study.q240207;

public class Application {

    public static void main(String[] args) {

        /*
        주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

        이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

        김씨와 이씨는 각각 몇 명 인가요?
        "이재영"이란 이름이 몇 번 반복되나요?
        중복을 제거한 이름을 출력하세요
        중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
         */

        String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";

        Method method = new Method();
        String[] name = method.stringToArray(str);

        System.out.println("김씨는 " + method.findKim(name) + "명이고, 이씨는 " + method.findLee(name) + "명입니다.");

        System.out.println("이재영이란 이름은 " + method.findLeeJaeYoung(name) + "번 반복됩니다.");

        System.out.println("===== 중복을 제거한 이름 출력 =====");
        method.printArr(method.dupRemove(name));

        System.out.println("===== 중복을 제거한 이름을 오름차순으로 정렬하여 출력 =====");
        method.printArr(method.ascenArr(method.dupRemove(name)));
    }
}
