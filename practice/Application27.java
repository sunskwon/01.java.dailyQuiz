package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application27 {

    public int max;

    public static void main(String[] args) {

        /*
        지원이는 사탕을 사기위해 새로 개업한 사탕가게에 갔다.
        사탕가게 아저씨는 격자판에 사탕을 각각 담아 두고, 첫 손님 기념으로 다음과 같은 제안을 하였다.
        "각 행과 열에 여러개의 사탕이 있는데, 각 행과 열이 겹치지 않게 사탕을 가져가라. "
        즉, 1행 1열을 선택했다면 2행 부터는 1열을 선택하지 못한다.
        지원이는 머리를 써서 최대한 많은 수의 사탕을 가지고 싶어한다.
        지원이가 가질 수 있는 최대 사탕수를 구하시오.

        입력
        첫 행에 격자판의 크기 N이 입력된다.
        (N <= 10)
        둘째 행부터 N + 1행까지 격자판의 정보인 사탕수가 입력된다.

        출력
        지원이가 가질 수 있는 최대 사탕수를 출력한다.

        입력 예시
        3
        3 1 4
        2 5 4
        1 4 1

        출력 예시
        11
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("격자판의 크기 : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("사탕 수 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = i;
        }

        Application27 ap = new Application27();
        ap.permutation(arr, order, 0);

        System.out.println(ap.max);
    }

    public void permutation(int[][] arr, int[] order, int start) {

        if (start == order.length - 1) {

            int temp = 0;

            for (int i = 0; i < order.length; i++) {
                temp += arr[i][order[i]];
            }

            if (temp > max) {
                max = temp;
            }
        } else {
            for (int i = start; i < order.length; i++) {
                swap(order, start, i);
                permutation(arr, order, start + 1);
                swap(order, start, i);
            }
        }
    }

    public void swap(int[] order, int i, int j) {

        int temp =  order[i];
        order[i] = order[j];
        order[j] = temp;
    }
}
