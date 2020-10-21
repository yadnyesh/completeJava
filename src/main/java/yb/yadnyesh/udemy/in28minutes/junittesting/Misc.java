package yb.yadnyesh.udemy.in28minutes.junittesting;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ForkJoinPool;

@Slf4j
public class Misc {
    public static void main(String[] args) {
        log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));
        log.info(ForkJoinPool.commonPool().toString());
    }
}
