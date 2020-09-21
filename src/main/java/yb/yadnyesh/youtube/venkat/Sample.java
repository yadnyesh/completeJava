package yb.yadnyesh.youtube.venkat;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void printIt(int number) {
        System.out.println("p: " + number +"--"+ Thread.currentThread());
    }

    public static Integer transform(Integer number) {
        System.out.println("t: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return number * 2;
    }

    public static Boolean check(Integer number) {
        System.out.println("c: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.parallelStream()
                .filter(e -> check(e))
                .forEachOrdered(e -> printIt(e));
        //For Each Ordered guarantee the source stream should be ordered
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
