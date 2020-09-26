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

    private static int compute() {
        try {
            sleep(1);
            return 2;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = create();
//        future.thenAccept(data -> log.info(data.toString()))
//        .thenRun(() -> log.info("This never dies"))
//        .thenRun(() -> log.info("Really...This never dies"))
//        .thenRun(() -> log.info("Really.....Really..This never dies"));
        log.info("got it");
        log.info(future.getNow(0).toString());
        log.info("here");
    }
}
