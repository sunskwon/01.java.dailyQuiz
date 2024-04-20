package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application30 {

    public static void main(String[] args) {

        /*
        어떤 수열이 있을 때 연속된 구간의 최대합을 출력하려고 한다.
        예를 들어
        2 -6 4 5 -2 6 2 -1이라는 수열이 있다면
        연속된 구간의 최대 부분합은 15이다. (4+5+ -2 + 6 + 2)

        입력
        첫째줄에 수열의 원소의 개수 n이 입력된다. (1 <= n <= 100,000)
        둘째 줄에 n개의 정수 원소 값이 차례대로 입력된다. (값의 범위: -100 ~ + 100)

        출력
        연속된 구간의 최대합을 출력한다.

        입력 예시
        8
        2 -6 4 5 -2 6 2 -1

        출력 예시
        15
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("원소의 개수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("원소 값 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                temp += arr[j];
                if (temp > max) {
                    max = temp;
                }
            }
        }

        System.out.println(max);
    }
}
