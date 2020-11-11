package com.example.demo;

/**
 * remark
 * Create By Administrator
 * time:2020/11/10
 **/
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("By Thread start");
    }

    public static void main(String[] args) {
        new ThreadDemo().start();
    }
}

