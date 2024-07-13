package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application9 {

    public static void main(String[] args) {

        /*
        콜라츠의 추측, 3n + 1 문제, 우박수 문제라고 불리는 이 문제는 다음과 같다.
        1, 어떤 자연수 n이 입력되면,
        2. n이 홀수이면 3n + 1을 하고,
        3. n이 짝수이면 n / 2를 한다.
        4. 이 n이 1이 될때까지 2 3 과정을 반복한다.
        예를 들어 5는 5 → 16 → 8 → 4 → 2 → 1 이 된다.
        이 처럼 어떤 자연수 n이 입력되면 위 알고리즘에 의해 1이 되는 과정을 모두 출력하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
        금지 키워드 : for while goto

        입력
        자연수 n이 입력된다.
        (1 <= n <= 10,000,000)
        단, 3n + 1 이 되는 과정에서 i n t 범위를 넘는 수는 입력으로 주어지지 않는다.

        출력
        3n + 1의 과정을 출력한다

        입력 예시
        5

        출력 예시
        5
        16
        8
        4
        2
        1
        */

        Application9 ap = new Application9();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 n : ");
        int n = sc.nextInt();

        ap.rec(n);
    }

    public void rec(int i) {

        System.out.println(i);
        if (i == 1) {
            return;
        } else if (i % 2 == 0) {
            rec(i / 2);
        } else {
            rec(3 * i + 1);
        }
    }
}