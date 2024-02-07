package com.ohgiraffers.test;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름 연습 */
        System.out.println("main 프로그램 시작됨...");

        Application01 app1 = new Application01();
        app1.testMethod1();

        app1.testMethod2();

        System.out.println("main 프로그램 모든 작업 종료 후 없어짐...");


    }

    public void testMethod1(){

        System.out.println("testMethod1 출력....");

        testMethod2();

        System.out.println("testMethod2 종료....");
    }

    public void testMethod2(){

        System.out.println("안녕! 나는 testMethod2야 불렀니?");

        System.out.println(testMethod3()); //값 자체를 출력문에 넣어 출력을 함
        String hi = testMethod3();
        System.out.println("hi : " + hi);  //값을 변수 공간에 담아 출력을 한 상태

        System.out.println("나도 용무 마쳤으니 돌아가볼게~~~");



//        return;
    }

    public String testMethod3(){

        return "안녕 불렀어?";
    }
}
