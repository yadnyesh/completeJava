package yb.yadnyesh.youtube.venkat;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import static java.lang.Thread.sleep;

@Slf4j
public class CompletableFutureDemo {

    public static CompletableFuture<Integer> create() {
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        return CompletableFuture.supplyAsync(()->compute(), forkJoinPool);
    }

    public static void printIt(int i) {
        log.info("Printed: " + i + Thread.currentThread());
    }

    private static int compute() {
        try {
            log.info("compute: " + Thread.currentThread());
            //sleep(1);
            return 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info("Main Thread: " +  Thread.currentThread());
        CompletableFuture<Integer> completableFuture = new CompletableFuture<Integer>();
        completableFuture
            .thenApply(data -> data * 2)
            .thenApply(data -> data + 1)
            .thenAccept(data -> log.info(data.toString()));
        sleep(1000);
        completableFuture.complete(2);
        sleep(1000);

    }
}
