package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application15 {

    public static void main(String[] args) {

        /*
        주영이는 사다리 게임을 좋아한다.
        그는 긴 사다리도 쉽게 결과를 알 수 있게 사다리 타기 게임의 결과를 구하는 프로그램을 작성하려고 한다.
        주영이를 도와주는 프로그램을 만들자.
        프로그램은 다음과 같이 진행된다.
        1. 세로 선의 개수 k와 한 선과 다른 선을 연결하는 선의 개수 n이 입력된다. (단, 2 <= k<=100, 0 <= n <= 100,000)
        2. n+1줄까지 두 개의 선 번호가 입력된다. 이는 두 선이 연결되었다는 뜻이다. 두 선의 번호는 1 차이다. 단, 선의 순서는 입력 순서다.
        (1 2후 2 3이 입력되었을 경우 1에서 시작하면 1-2가 먼저이니 2로 이동한 후 2-3이 다음이니 3으로 다시 이동한다.)
        3. 시작 선의 번호가 주어진다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("세로 선의 개수 k를 입력하세요 : ");
        int k = sc.nextInt();
        System.out.print("한 선과 다른 선을 연결하는 선의 개수 n을 입력하세요 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("연결된 두 선을 순서대로 입력하세요 (예 : 1 2) : ");
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.print("시작 위치를 입력하세요 : ");
        int input = sc.nextInt();
        int output = input;

        for (int i = 0; i < arr.length; i++) {
            if (output == arr[i][0]) {
                output = arr[i][1];
            } else if (output == arr[i][1]) {
                output = arr[i][0];
            }
        }

        System.out.println(input + "에서 시작한 사다리는 " + output + "에 도착합니다.");
    }
}
