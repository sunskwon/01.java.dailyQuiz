package com.ohgiraffers.answer.Koo;

import java.util.Scanner;

public class A240130 {

    public static void main(String[] args) {

        /* 오늘 먹은 점심식사 식당의 정보에 대해서 입력하고 출력하시오
         *   ----- 출력예시 -----
         *   식당 이름 :   , 메뉴 :  , 가격 :    , 평점 :
         * (평점은 5점만점으로 소수점까지 기입 가능하도록 하시오.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("식당 이름을 입력하세요 : ");
        String str1 = sc.nextLine();
        System.out.print("메뉴를 입력하세요 : ");
        String str2 = sc.nextLine();
        System.out.print("가격을 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("평점을 입력하세요 : ");
        double num2 = sc.nextDouble();

        A240130 a = new A240130();
        a.sort(str1, str2, num1, num2);
    }

    public void sort(String str1, String str2, int num1, double num2) {

        System.out.println("식당 이름 : " + str1 + ", 메뉴 : " + str2 + ", 가격 : " + num1 + "원, 평점 : " + num2);
    }
}
