package com.ohgiraffers.quiz;

public class Q240129_1 {

    public static void main(String[] args) {

        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 유니코드를 이용해서 문자 'k'가 출력되도록 하세요
         * (문자 직접 입력 금지)
         * */

        char ch1 = 'a';
        int inum1 = ch1;
        int inum2 = inum1 + 10;
        char ch2 = (char) inum2;

        System.out.println(ch2);
    }
}
