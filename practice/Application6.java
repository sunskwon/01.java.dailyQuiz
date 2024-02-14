package com.ohgiraffers.practice;

import com.ohgiraffers.answer.kang.Q240202.Application;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
        우리는 1부터 N까지의 숫자가 차례대로 적힌 N장의 카드 묶음을 가지고 있다.
        그런 데 이 카드 묶음을 옮기는 중 실수로 땅에 떨어뜨려 그 중 한 장을 잃어버렸다.
        여러 분은 땅에 떨어진 카드 묶음을 읽어서 빠진 하나의 카드 번호를 찾아 출력해야 한다.
         */

        Application6 ap = new Application6();
        ap.inputNum();
    }

    public void inputNum() {

        int allSum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("카드 묶음의 카드 숫자를 입력해주세요. (3 ~ 50) : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            allSum += i;
        }

        int i = 1;
        int sum = 0;
        while (i < n) {

            System.out.print("카드의 숫자를 입력해주세요. ");
            sum += sc.nextInt();
            i++;
        }

        int result = allSum - sum;

        System.out.println("잃어버린 카드의 숫자는 " + result + "입니다.");

    }
}
