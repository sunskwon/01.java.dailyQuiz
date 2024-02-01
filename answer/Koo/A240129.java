package com.ohgiraffers.answer.Koo;

public class A240129 {

    public static void main(String[] args) {

        /* a는 하루에 총 3번의 식사를 하는데 아침에 1시간 점심에 1시간 저녁은 1시간 30분이 소요된다
         * a가 하루에 총 식사를 하는데 드는 시간의 총합과 평균시간을 출력하시오 (기준은 시간입니다.)
         * 평균 식사 시간에 소수점은 안나오게 출력하시오
         * --- 출력예시 ---
         * 총 식사시간 : 3.5
         * 평균 식사시간 : 1
         * */

        int breakFast = 1;
        int lunch = 1;
        double dinner = 1.5;

        double total = breakFast + lunch + dinner;
        int ave = (int) (total / 3);

        System.out.println("총 식사시간 : " + total);
        System.out.println("평균 식사시간 : " + ave);
    }
}
