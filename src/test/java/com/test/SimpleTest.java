package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.*;

public class SimpleTest {

    @Test
    public void doTest() throws Exception {
        CountDownLatch downLatch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> result1 = executorService
                .submit(() -> {
                    System.out.println("Thread " + Thread.currentThread().getName() + " works");
                    TimeUnit.SECONDS.sleep(3);
                    downLatch.countDown();
                    return 1;
                });

        Future<Integer> result2 = executorService
                .submit(() -> {
                    System.out.println("Thread " + Thread.currentThread().getName() + " works");
                    TimeUnit.SECONDS.sleep(2);
                    if(true)throw new RuntimeException("Because I can");
                    downLatch.countDown();

                    return 66;

                });


        Future<Integer> longRuning= executorService
                .submit(() -> {
                    System.out.println("Thread " + Thread.currentThread().getName() + " works");
                    TimeUnit.SECONDS.sleep(5);

                    downLatch.countDown();

                    return 6066;

                });


        System.out.println("Start waiting");
        downLatch.await();


        System.out.println("Result 1 is " + result1.get());
        System.out.println("Result 2 is " + result2.get());
        System.out.println("Result long running 3 is " + longRuning.get());
        System.out.println("Stop waiting");
    }


}
