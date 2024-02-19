package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application12 {

    public static void main(String[] args) {

        /*
        숫자에 관심이 많은 영일이는 수열을 보고 오름차순 수열인지 내림차순 수열인지 판단하려고 한다.
        오름차순이란 작은 수부터 큰 수 순서로 나열한것을 말하고, 내림차순은 그 반대인 경우이다.
        이 두 경우가 아닌 경우는 '섞임'으로 판단한다.
        n개의 수가 주어지면, '오름차순', '내림차순', '섞임'을 판단하는 프로그램을 작성하시오.
        예를 들어, 1 1 2 3 5 5 6인 경우 '오름차순', 7 6 6 5 3 1인 경우 '내림차순',  21 22 21 22인 경우 '섞임'으로 판단한다.
        만약 모두 같은 수가 입력되면 '섞임'으로 판단한다.
         */

        Application12 ap = new Application12();

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
        int equal = 0;
        int startNum = arr[0];
        int lastNum = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                countDesc += 1;
            } else if (arr[i] < arr[i + 1]) {

                countAsc += 1;
            } else if (arr[i] == arr[i + 1]) {

                equal += 1;
            }
        }

        if (equal == arr.length - 1 && startNum == lastNum) {

            System.out.println("섞임");
        } else if (countAsc + equal == arr.length - 1) {

            System.out.println("오름차순");
        } else if (countDesc + equal == arr.length - 1) {

            System.out.println("내림차순");
        } else {

            System.out.println("섞임");
        }
    }
}

