package com.ohgiraffers.quiz;

public class Q240130 {

    public static void main(String[] args) {

        // 다음 코드를 수정하여 'true' 값이 출력되도록 수정하세요

        int a = 1;
        int b = 2;

        boolean result = (((a *= b) > (a += b)) && ((a -= b) < (a /= b)));

        System.out.println(!result);
    }
}
