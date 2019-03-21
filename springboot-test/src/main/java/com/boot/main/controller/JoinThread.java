package com.boot.main.controller;

public class JoinThread {

    public static void main(String[] args) throws InterruptedException {

        Thread s1 =new GoThread("小明");
        Thread s2 =new GoThread("小王");
        s1.start();
        s1.join();
        s2.start();
    }
}

class GoThread extends Thread{

    private String hiName ;

    public String getHiName() {
        return hiName;
    }

    public void setHiName(String hiName) {
        this.hiName = hiName;
    }

    public GoThread(String hiName){
        this.hiName=hiName;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(getHiName());
        }
    }
}
