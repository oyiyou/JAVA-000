package com.example.demo;

/**
 * remark
 * Create By Administrator
 * time:2020/11/10
 **/
public class ByRunnable{

    private String getInfo(){
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ByRunnable ru = new ByRunnable();
        Thread th = new Thread(()->{
            System.out.println("runnable name is "+ru.getInfo());
        });
        th.start();
    }
}
