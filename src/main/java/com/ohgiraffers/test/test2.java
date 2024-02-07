package com.ohgiraffers.test;

public class test2 {
    public static void main(String[] args) {

        test2 t = new test2();
        int result = t.plusTwoNumbers(55, 65);
        System.out.println("result = " + result);

    }

    public int plusTwoNumbers(int first, int second){

        return first + second;
    }

    public int minusTwoNumbers (int first, int second){

        return first - second;
    }


}
