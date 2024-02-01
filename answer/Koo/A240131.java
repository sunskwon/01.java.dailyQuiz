package com.ohgiraffers.answer.Koo;

import java.util.Scanner;

public class A240131 {

    public static void main(String[] args) {

        /*
         * 출력예시
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 1
         * 상품명을 입력하시오 : java
         * 상품 가격을 입력하시오 : 20000
         * 구매 수량을 입력하세오 : 3
         * 상품명:java 가격:20000 수량:3 합계:60000
         *
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 2
         * 프로그램을 종료합니다.
         *
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 3
         * 올바른 옵션을 선택하시오.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 상품등록, 2. 프로그램 종료");
        System.out.print("옵션을 선택하세요 : ");
        int num1 = sc.nextInt();

        if (num1 == 1) {

            sc.nextLine();
            System.out.print("상품명을 입력하세요 : ");
            String str = sc.nextLine();
            System.out.print("상품 가격을 입력세요 : ");
            int price = sc.nextInt();
            System.out.print("구매 수량을 입력하세요 : ");
            int num = sc.nextInt();

            System.out.println("상품명 : " + str + " 가격 : " + price + " 수량 : " + num + " 합계 : " + (price * num));
        } else if (num1 == 2) {

            System.out.println("프로그램을 종료합니다.");
        } else {

            System.out.println("올바른 옵션을 선택하세요.");
        }
    }
}
