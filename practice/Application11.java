package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
        성근이는 오름차순과 내림차순에 대한 공부를 하고 있다.
        어떤 수 n개가 주어지면 그 수열이 오름차순인지, 내림차순인지, 섞여 있는지 판단하시오.

         입력 예시)
         5
         2 5 8 10 29

         출력 예시)
         오름차순
         */

        Application11 ap = new Application11();

        ap.AscOrDesC(ap.scanNumber());
    }

    public int[] scanNumber() {

        Scanner sc = new Scanner(System.in);

        System.out.print("데이터 갯수를 입력하세요 : ");
        int number = sc.nextInt();

        System.out.print("수열을 입력하세요 : ");
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public void AscOrDesC(int[] arr) {

        int countAsc = 0;
        int countDesc = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] >= arr[i + 1]) {

                countDesc += 1;
            } else if (arr[i] <= arr[i + 1]) {

                countAsc += 1;
            }
        }

        if (countAsc == arr.length - 1) {

            System.out.println("오름차순");
        } else if (countDesc == arr.length - 1) {

            System.out.println("내림차순");
        } else {

            System.out.println("혼합");
        }
    }
}
