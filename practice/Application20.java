package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application20 {

    public static void main(String[] args) {

        /*
        주현이 엄마는 '기억력 테스트 6'이 너무 가혹해서인지 이번에는 좀 쉬운 테스트를 하기로 했다.
        이번에도 n개의 숫자를 불러 주고, m개의 질문을 한다.
        질문은 두 수 a, b를 이야기 하는데, a번째와 b번째 사이에 불렀던 수들의 합을 묻는다.
        예를 들어, 3 5 2 1 4 3 의 숫자를 불러주고,  2, 4라고 질문하면 2번째에서 4번째 불렀던 숫자들의 합인 8을 대답해야한다.
        이번 테스트를 무사히 통과하면 '닌자 고'의 4종 캐릭터 장난감을 받을 수 있다.

        입력
        첫째 줄에 n과 m이 입력된다. ( 1 <= n <= 1,000,000 ) , ( 1 <= m <= 100,000 )
        둘째 줄에 n개의 정수가 공백으로 분리되어 입력된다. (입력수의 범위 : -1,000 ~ 1,000)
        셋째 줄부터 m개의 질문이 입력되는데, 시작수 a와 마지막 수 b가 입력된다. ( 1 <= a <= b <= n )

        출력
        질문의 순서대로 각 줄에 a번째와 b번째 사이에 불렀던 수들의 합을 출력한다.

        입력 예시
        6 3
        3 5 2 1 4 3
        2 4
        1 1
        1 3

        출력 예시
        8
        3
        10
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자의 갯수과 질문의 갯수를 입력하세요 : ");
        int[] amount = new int[2];
        amount[0] = sc.nextInt();
        amount[1] = sc.nextInt();

        System.out.println("숫자들을 순서대로 입력하세요 : ");
        int[] number = new int[amount[0]];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("시작점과 끝점을 순서대로 입력하세요 : ");
        int[][] question = new int[amount[1]][2];
        for (int i = 0; i < question.length; i++) {
            for (int j = 0; j < question[i].length; j++) {

                question[i][j] = sc.nextInt();
            }
        }

        int[] answer = new int[amount[1]];
        for (int i = 0; i < answer.length; i++) {
            int temp = 0;
            for (int j = question[i][0] - 1; j < question[i][1]; j++) {
                temp += number[j];
            }
            System.out.println(temp);
        }
    }
}
