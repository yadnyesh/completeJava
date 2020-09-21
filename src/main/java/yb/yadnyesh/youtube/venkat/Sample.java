package yb.yadnyesh.youtube.venkat;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void printIt(int number) {
        System.out.println("p: " + number +"--"+ Thread.currentThread());
    }

    public static Integer transform(Integer i) {
        return i * 2;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.parallelStream()
                .map(e -> transform(e))
                //.forEach(e -> printIt(e));
                .forEachOrdered(e -> printIt(e));
        //For Each Ordered guarantee the source stream should be ordered
    }
}
