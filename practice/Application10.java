package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application10 {

    public static void main(String[] args) {

        /*
        SuperSum 함수는 다음과 같이 정의된다.
        SuperSum(0,n) = n (n은  모든 양의 정수)
        SuperSum(k,n) = SuperSum(k − 1,1)+SuperSum(k − 1,2)+...+SuperSum(k − 1,n) k와 n이 여러개 주어진다.
        SuperSum의 값을 각각 출력하시오.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("k값을 입력하세요 : ");
        int k = sc.nextInt();
        System.out.print("n값을 입력하세요 : ");
        int n = sc.nextInt();

        Application10 ap = new Application10();

        ap.print(ap.superSum(k, n));
    }

    public int superSum(int k, int n) {

        int result = 0;

        if (k > 1) {

            for (int i = 1; i <= n; i++) {

                result += superSum(k - 1, i);

            }

        } else if (k == 1) {

            for (int i = 1; i <= n; i++) {

                result += i;

            }
        }

        return result;

    }

    public void print(int result) {

        System.out.println(result);

    }
}
