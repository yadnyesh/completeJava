package yb.yadnyesh.udemy.cop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    Random random = new Random();

    private List<Integer> integerList1 = new ArrayList<Integer>();
    private List<Integer> integerList2 = new ArrayList<Integer>();

    public void stage1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        integerList1.add(random.nextInt(100));
    }

    public void stage2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        integerList2.add(random.nextInt(100));
    }

    public void processList() {
        for(int i = 0; i < 1000; i++) {
            stage1();
            stage2();
        }
    }

    public void main() {
        System.out.println("Starting ......");
        long start = System.currentTimeMillis();
        processList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + integerList1.size() + "; " + "List2: " + integerList2.size());
    }
}
