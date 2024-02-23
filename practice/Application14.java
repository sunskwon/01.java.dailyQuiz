package com.ohgiraffers.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Application14 {

    public static void main(String[] args) {

        /*
        큰 수를 표현할 때 자릿수를 쉽게 구분하기 위해 천단위 구분 기호인 콤마(,)를 사용한다.
        어떤 수가 입력되면 천단위 구분 기호를 넣어 그 수를 다시 출력하는 프로그램을 작성하시오.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자의 길이를 입력하세요 : ");
        int length = sc.nextInt();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while (num / 1000 >= 1) {

            arr.add(num - (num / 1000) * 1000);
            num /= 1000;
        }

        Object[] array = arr.toArray();
        String print = num + "";

        for (int j = array.length - 1; j >= 0; j--) {
            print += ",";
            print += array[j];
        }

        System.out.println("print = " + print);

    }
}
