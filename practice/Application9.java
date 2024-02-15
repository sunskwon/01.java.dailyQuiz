package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application9 {

    public static void main(String[] args) {

        System.out.print("임의의 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Application9 ap = new Application9();
        System.out.println(ap.binary(num));
    }

    public String binary(int n) {

        if (n / 2 != 0) {

            return binary(n / 2) + (n % 2);

        } else if (n / 2 == 0 && n % 2 == 1) {

            return "1";

        }

        return null;

    }
}
