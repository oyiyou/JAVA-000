package com.example.demo;

import org.springframework.cache.annotation.Cacheable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * remark
 * Create By Administrator
 * time:2020/11/10
 **/
public class ByCallable implements Callable {
    private String getInfo(){
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ByRunnable ru = new ByRunnable();
        FutureTask<?> task = new FutureTask<>(new ByCallable());
        Thread th = new Thread(task);
        th.start();
        String result = (String) task.get();
        System.out.println(result);
    }

    @Override
    public Object call() throws Exception {
        return getInfo();
    }
}
