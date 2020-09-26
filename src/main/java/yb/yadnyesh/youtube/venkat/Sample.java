package yb.yadnyesh.youtube.venkat;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@Slf4j
public class Sample {
    public static void printIt(int number) {
        log.info("p: " + number +"--"+ Thread.currentThread());
    }

    public static int transform(int number) {
        log.info("t: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return number * 2;
    }

    public static Boolean check(Integer number) {
        log.info("c: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return true;
    }

    public static void process(Stream<Integer> stream) throws Exception {
        ForkJoinPool forkJoinPool = new ForkJoinPool(100);
        forkJoinPool.submit(() -> stream.forEach(e -> {}));
        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,
                                            11,12,13,14,15,16,17,18,19,20);

        process(numbers.parallelStream().map(Sample::transform));
//        log.info(numbers.stream()
//                .reduce(0, Sample::add).toString());
    }

    public static int add(int total, int e) {
        int result = total + e;
        log.info("Total = " + total + " E = " + e + " Result = " + result + "--" + Thread.currentThread());
        return result;
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return true;
    }
}
