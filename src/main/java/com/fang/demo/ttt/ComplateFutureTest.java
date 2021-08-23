package com.fang.demo.ttt;

import java.util.concurrent.*;

/**
 * @ClassName ComplateFutureTest
 * @Author fang
 * @Date 2021/8/19
 * @Description TODO
 * @Version 1.0
 */
public class ComplateFutureTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,5,3, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(100));


        //CountDownLatch countDownLatch = new CountDownLatch(3);

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           // countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+ "hahaa....1s延迟");

            return "111";
        },threadPoolExecutor);

        CompletableFuture<String> completableFuture11 = completableFuture.whenComplete((t, u) -> {

            System.out.println(t);
            System.out.println(u);
        });

        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + "hahaa....2s延迟");
        },threadPoolExecutor);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(() -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + "hahaa....3s延迟");
        },threadPoolExecutor);


        //countDownLatch.await();


        System.out.println("main方法要执行了...");

    }


}
