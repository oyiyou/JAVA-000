package com.example.demo;

import java.util.List;
import java.util.concurrent.*;

/**
 * remark
 * Create By Administrator
 * time:2020/11/10
 **/
public class ByPool {
    private  static ExecutorService service = new ThreadPoolExecutor(4,8,60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static void main(String[] args) {
        ByPool pool = new ByPool();
        int i = 0;
        try {
            while (i < 100) {
                Future<?> test = service.submit(() -> {
                    System.out.println("by pool name is " + pool.getInfo());
                });
                i++;
            }
        }finally {
            service.shutdown();
        }
    }

    private String getInfo(){
        return Thread.currentThread().getName();
    }
}
