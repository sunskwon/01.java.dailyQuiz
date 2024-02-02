package com.ohgiraffers.answer.Koo;

import java.util.Scanner;

public class A240201 {

    public static void main(String[] args) {

        /* ------- 예시 ----------
         *  입력하실 정수의 갯수를 적으시오
         *  n개의 정수를 입력하세요 :
         *  1
         *  .
         *  .
         *  .
         *  n
         *  입력한 정수를 역순으로 출력 :
         *  n . . . 1 */

        A240201 a = new A240201();
        a.printNumbers();
    }

    public void printNumbers() {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력하실 정수의 갯수를 적으세요 : ");
        int num = sc.nextInt();

        System.out.println(num + "개의 정수를 출력합니다 : ");

        for (int i = 1; i <= num; i++) {

            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(num + "개의 정수를 역순으로 출력합니다. : ");


        for (int j = num; j >= 1; j--) {

            System.out.print(j + " ");
        }
    }
}
