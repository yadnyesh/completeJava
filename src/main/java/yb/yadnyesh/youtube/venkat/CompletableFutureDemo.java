package yb.yadnyesh.youtube.venkat;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;

@Slf4j
public class CompletableFutureDemo {

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(()->2);
    }

    public static void main(String[] args) {
        CompletableFuture<Integer> future = create();
    }
}
