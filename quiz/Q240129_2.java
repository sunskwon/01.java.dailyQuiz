package com.ohgiraffers.quiz;

public class Q240129_2 {

    public static void main(String[] args) {

        /* 31.5를 4로 나눴을 때의 정수 형태의 몫을 출력하고
         * 실수 형태의 나머지를 출력하세요
         *
         * -- 출력 예시 --
         * 몫(정수) : xx
         * 나머지(실수) : yy.y
         *  */

        double dnum = 31.5;
        int inum = (int) dnum;

        int divisionQuotient = inum / 4;
        double divisionRemainder = (inum % 4) + dnum - inum;

        System.out.println("몫(정수) : " + divisionQuotient);
        System.out.println("나머지(실수) : " + divisionRemainder);
    }
}
