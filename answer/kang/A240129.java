package com.ohgiraffers.answer.kang;

public class A240129 {

    public static void main(String[] args) {

        /* 4명의 친구들과 식사로 떡볶이 값 7000원, 순대 값 3000원, 튀김 값 2500원, 김밥 값 5000원 나왔다.
         *  각 음식 값을 정수 형태로 저장 한 뒤 총액과 1인당 지불해야 하는 금액을 출력하세요.
         *  -----출력 예시-----
         *  총액 : 17500원
         *  1인당 지불할 금액 : 3500원
         * */

        int dduk = 7000;
        int sun = 3000;
        int tui = 2500;
        int kim = 5000;

        System.out.println("총액 : " + (dduk + sun + tui + kim) + "원");
        System.out.println("1인당 지불할 금액 : " + ((dduk + sun + tui + kim) / 4) + "원");
    }
}
