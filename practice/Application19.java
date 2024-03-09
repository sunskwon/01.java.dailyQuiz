package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application19 {

    public static void main(String[] args) {
        /*
        주현이 엄마는 주현이를 영재로 키우기 위해 매일 혹독한 기억력 테스트를 하고 있다.
        N개의 숫자를 먼저 말해주고, M개의 질문을 하면서 그 숫자를 몇 번째로 불렀는지 테스트한다.
        이번 테스트가 어려울 것을 예상하여 N개의 데이터를 부를 때 오름차순으로 부른다.
        이 테스트를 통과할 경우 주현이는 최신 장난감 "또봇 W 쉴드온"을 받을 수 있다.
        주현이를 도와 줄수 있는 프로그램을 작성하시오.

        입력 :
        첫째줄에 N이 입력된다. (1≤N≤1,000,000)
        둘째 줄에 N개의 서로 다른 숫자가 공백으로 구분되어 오름차순으로  입력된다. (데이터값의 범위 : 1 ~ 100,000,000)
        셋째줄에 질문의 수 M이 입력된다. (1≤M≤100,000)
        단, 질문은 오름차순으로 묻지 않는다.
        넷째 줄에 M개의 질문이 입력된다

        출력 :
        M개의 질문에 대해 그 숫자가 있었으면 그 숫자의 위치를 출력, 없었으면 -1을 차례대로 출력한다.

        입력 예시 :
        5
        2 23 55 87 100
        4
        5 2 100 55

        출력 예시 :
        -1 1 5 3
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자의 갯수를 입력하세요 : ");
        int n = sc.nextInt();

        System.out.print("숫자를 공백으로 구분해서 오름차순으로 입력하세요 : ");
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.print("질문의 갯수를 입력하세요 : ");
        int m = sc.nextInt();

        System.out.print("질문을 공백으로 구분해서 입력하세요 : ");
        int[] question = new int[m];
        for (int i = 0; i < m; i++) {
            question[i] = sc.nextInt();
        }

        int[] answer = new int[m];
        for (int i = 0; i < question.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (question[i] == input[j]) {
                    answer[i] = j + 1;
                    break;
                } else if (j == input.length - 1) {
                    answer[i] = -1;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
