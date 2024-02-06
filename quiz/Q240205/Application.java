package com.ohgiraffers.quiz.Q240205;

public class Application {

    public static void main(String[] args) {

        /*
        Application 외부에 클래스에서만 접근할 수 있는 숫자형 변수 'number' 를 선언하고,
        이 변수에 입력한 임의의 숫자가 각각
        1) 양수이며 실수
        2) 양수이며 정수
        3) 0
        4) 음수
        인 경우를 구분하여 출력하는 코드를 작성하세요

        출력 예시
        입력하신 135.7은(는) 0 이상의 실수입니다.
         */

        Number number = new Number();

        number.numberScan();

        number.positiveNumber();

        number.realNumberOrInteger();
    }
}
