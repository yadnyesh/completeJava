package yb.yadnyesh.youtube.venkat;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Sample {
    public static void printIt(int number) {
        System.out.println("p: " + number +"--"+ Thread.currentThread());
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

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        log.info(numbers.stream()
                .reduce(0, (total, e) -> add(total,e)).toString());
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
            e.printStackTrace();
        }
        return true;
    }
}
