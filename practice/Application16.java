package com.ohgiraffers.practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Application16 {

    public static void main(String[] args) {

        /*
        두 정수 a, b의 약수를 모두 출력하는 프로그램을 작성하시오.
         */

        int[] arr = new int[2];
        TreeSet<Integer> divisor = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요 (예 : 1 2) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 1;
        while (i <= arr[0]) {
            if (arr[0] % i == 0) {
                divisor.add(i);
            }
                i++;
        }

        int j = 1;
        while (j <= arr[1]) {
            if (arr[1] % j == 0) {
                divisor.add(j);
            }
                j++;
        }

        for (int k = 0; k < divisor.size(); k++) {
            System.out.print(divisor.toArray()[k] + " ");
        }
        System.out.println("\ndivisor = " + divisor);
    }
}
