package com.ohgiraffers.answer.kang.Q240202;

import java.util.Scanner;

public class SpinSort {

    private int num;
    private int step;
    private int input = 1;

    public int scanNum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        return this.num = this.step = num;
    }

    public int[][] makeArray(int num1) {

        int[][] arr = new int[num1][num1];
        int i = 0;
        int j = 0;

        for (j = 0; j < arr[i].length; j++) {

            arr[i][j] = input++;
        }



        return arr;
    }
}