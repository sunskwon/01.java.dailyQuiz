package com.ohgiraffers.answer.kang;

public class A240130 {

    public static void main(String[] args) {

        /* non-static 메소드를 호출하여 아래와 같이 출력하시오.
         *
         * ------ 출력 예시 -------
         * 메소드 호출 확인...
         * 두 수 중 3의 배수는 39입니다.
         * 홍길동은 어른, 심청이는 청소년 입니다.
         * 메소드 호출 종료...
         * -----------------------
         * */

        A240130 a = new A240130();
        a.call();
    }

    public void call() {

        System.out.println("메소드 호출 확인...");
        System.out.println("두 수 중 3의 배수는 39입니다.");
        System.out.println("홍길동은 어른, 심청이는 청소년 입니다.");
        System.out.println("메소드 호출 종료...");
    }
}
