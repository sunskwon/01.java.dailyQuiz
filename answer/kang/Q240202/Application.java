package com.ohgiraffers.answer.kang.Q240202;

public class Application {

    public static void main(String[] args) {

        /* 정수를 입력받아 다음과 같은 N * N 배열 구조를 출력해보자.*/
        /* 출력예시
         *  i) 입력이 N이 3 인 경우
         *     달팽이 배열 채우기 프로그램을 시작합니다.
         *     양의 정수를 입력하세요 : 3
         *     1 2 3
         *     8 9 4
         *     7 6 5
         *     프로그램을 종료합니다.
         * ii) 입력이 4 * 4 인 경우
         *     달팽이 배열 채우기 프로그램을 시작합니다.
         *     양의 정수를 입력하세요 : 4
         *     1 2 3 4
         *     12 13 14 5
         *     11 16 15 6
         *     10 9 8 7
         *     프로그램을 종료합니다.
         * */

        SpinSort ss = new SpinSort();
        ss.scanNum();
    }
}
