package com.boot.main.controller;

public class VolatitleTest {
    int a,b;
    volatile int c,d;



    public void test(){
        a =1;
        b =2;
        c =a;
        d =b;
        a =4;
        b=5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        new VolatitleTest().test();
    }
}
