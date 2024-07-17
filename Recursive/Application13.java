package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

        /*
        다음과 같은 삼각형을 파스칼의 삼각형이라고 한다.
             1                  1  1  1  1  1  1  1  ...
            1 1                 1  2  3  4  5  6  ...
           1 2 1                1  3  6 10 15  ...
          1 3  3 1              1  4 10 20 ...
         1 4  6  4 1            1  5 15  ...
        1 5 10 10 5 1           1  6  ...
                                1  ...

        회전 변환된 이 삼각형에서 (r행, c열)의 값을 알 수 있는 프로그램을 작성하시오.
        행과 열은 1부터 시작한다.

        입력
        자연수 r과 c가 입력된다. (1 ≤ r, c ≤ 50)

        출력
        (r, c)의 원소 값을 100,000,000으로 나눈 나머지를 출력한다.

        입력 예시
        3 2

        출력 예시
        3
        */

        Application13 ap = new Application13();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 r과 c :");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(ap.rec(r, c));
    }

    public int rec(int r, int c) {

        if (r == 1 || c == 1) {
            return 1;
        } else {
            return rec(r - 1, c) + rec(r, c - 1);
        }
    }
}
