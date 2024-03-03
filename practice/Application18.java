package com.ohgiraffers.practice;

import java.util.Scanner;
import java.util.Stack;

public class Application18 {

    public static void main(String[] args) {

        /*
        정보 동아리 회장을 선출하려고 한다.
        올해는 단일 후보만 등록하여 찬반 투표를 실시하였다.
        n명의 학생이 O, X로 의사 표현을 한다면 나올 수 있는 경우를 모두 출력하시오.
        예를 들어 2명이 투표하는 경우 나올 수 있는 경우는
        OO
        OX
        XO
        XX
        이다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하세요 : ");
        int num = sc.nextInt();
        int all = (int) Math.pow(2, num);
        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < all; i++) {

            int temp = i;

            for (int j = 0; j < num; j++) {
                if (temp % 2 == 1) {
                    stringStack.push(String.valueOf('X'));
                    temp /= 2;
                } else if (temp % 2 == 0) {
                    stringStack.push(String.valueOf('O'));
                    temp /= 2;
                }
            }

            for (int k = 0; k < num; k++) {
                System.out.print(stringStack.pop());
            }

            System.out.println();
        }
    }
}
