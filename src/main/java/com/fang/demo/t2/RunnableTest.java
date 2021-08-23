package com.fang.demo.t2;


import java.util.concurrent.*;

/**
 * @ClassName RunnableTest
 * @Author fang
 * @Date 2021/8/20
 * @Description TODO
 * @Version 1.0
 */
public class RunnableTest {


    public static void main(String[] args) {

       ExecutorService executorService = Executors.newFixedThreadPool(3);

        FutureTask<String> task = new FutureTask(() -> {
            System.out.println("futureTask执行了...");
            return "``";
        });

        //new Thread(task).start();
        Future<?> future = executorService.submit(task);
        try {
            //task.get();.
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
