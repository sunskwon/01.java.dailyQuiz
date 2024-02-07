package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        5 개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라.
        */

        Application4 a = new Application4();

        int[] arr = a.input();
        int max = a.max(arr);
        int min = a.min(arr);

        System.out.print("입력하신 ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println("중 최대값은 " + max + "이고, 최소값은 " + min + "입니다.");
    }

    public int[] input() {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        arr[0] = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        arr[1] = sc.nextInt();
        System.out.print("세 번째 정수를 입력해주세요 : ");
        arr[2] = sc.nextInt();
        System.out.print("네 번째 정수를 입력해주세요 : ");
        arr[3] = sc.nextInt();
        System.out.print("다섯 번째 정수를 입력해주세요 : ");
        arr[4] = sc.nextInt();

        return arr;
    }

    public int max(int[] arr) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            max = (max > arr[i])? max : arr[i];
        }

        return max;
    }

    public int min(int[] arr) {

        int min = 1000000000;

        for (int i = 0; i < arr.length; i++) {

            min = (min > arr[i])? arr[i] : min;
        }

        return min;
    }
}
