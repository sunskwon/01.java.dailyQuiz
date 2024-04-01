package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application23 {

    public static void main(String[] args) {

        /*
        테스트 3을 무사히 마친 주현이는 테스트 4에 도전하게 되었다.
        주현이 엄마는 이번에 무작위로 숫자 N개를 불러준다음, M개의 질문을 하기로 했다.
        질문으로 그 숫자가 있었으면 그 숫자를 몇 번째로 불렀는지 출력하고, 없었다면 -1을 출력한다.
        이 테스트에는 주현이가 좋아하는 '또봇 X, Y, Z'가 걸려있다.
        주현이를 도와줄수 있는 프로그램을 만드시오.

        입력
        첫째줄에 N이 입력된다. (1 <= N <= 1,000,000)
        둘째 줄에 N개의 서로 다른 숫자가 공백으로 구분되어  입력된다. ( 데이터값의 범위 : 1 ~ 100,000,000)
        셋째줄에 질문의 수 M이 입력된다. ( 1 <= M <= 100,000)
        넷째 줄에 M개의 질문이 입력된다

        출력
        M개의 질문에 대해 그 숫자가 있었으면 그 숫자를 몇 번째로 불렀는지를 출력, 없었으면 -1을 하나씩 차례대로 출력한다.

        입력예시
        5
        23 5 32 87 50
        4
        5 2 100 87

        출력예시
        2 -1 -1 4
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("문제의 갯수 : ");
        int n = sc.nextInt();

        int[] problem = new int[n];
        System.out.print("문제 : ");
        for (int i = 0; i < n; i++) {
            problem[i] = sc.nextInt();
        }

        System.out.print("질문의 갯수 : ");
        int m = sc.nextInt();

        int[] question = new int[m];
        System.out.print("질문 : ");
        for (int i = 0; i < m; i++) {
            question[i] = sc.nextInt();
        }

        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            answer[i] = -1;
            for (int j = 0; j < n; j++) {
                if (problem[j] == question[i]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(problem[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            System.out.print(question[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
