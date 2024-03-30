package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application21 {

    public static void main(String[] args) {

        /*
        N개의 입력 데이터가 주어지면 정렬해서 출력하시오.
        입력 예)
        5
        2 5 8 1 2
        출력 예)
        1 2 2 5 8

        입력
        첫 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 4,500,000 )
        둘째 줄에 공백으로 분리되어 N개의 데이터가 입력된다. ( 데이터 값의 범위 : 0 ~ 100,000 )

        출력
        데이터를 오름차순으로 정렬하여 출력한다.

        입력 예시
        5
        2 6 4 8 6

        출력 예시
        2 4 6 6 8
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("데이터의 갯수 : ");
        int num = sc.nextInt();
        int[] input = new int[num];

        System.out.print("데이터 입력 : ");
        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int temp = 0;
            for (int j = i + 1; j < num; j++) {
                if (input[i] > input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
