package yb.yadnyesh.youtube.venkat;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

@Slf4j
public class CompletableFutureDemo {

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(()->compute());
    }

    public static void printIt(int i) {
        log.info("Printed: " + i + Thread.currentThread());
    }

    private static int compute() {
        try {
            log.info("compute: " + Thread.currentThread());
            sleep(1000);
            return 2;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info("Main Thread: " +  Thread.currentThread());
        CompletableFuture<Integer> future = create();
        sleep(100);
        future
          .thenAccept(data -> printIt(data));
//        future.thenAccept(data -> log.info(data.toString()))
//        .thenRun(() -> log.info("This never dies"))
//        .thenRun(() -> log.info("Really...This never dies"))
//        .thenRun(() -> log.info("Really.....Really..This never dies"));
        log.info("got it");
        log.info(future.getNow(0).toString());
        log.info("here");
    }
}
