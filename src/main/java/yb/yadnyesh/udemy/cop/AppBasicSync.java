package yb.yadnyesh.udemy.cop;

import java.util.Scanner;

class Processor extends Thread {

    private volatile
    boolean running = true;

    public void run() {
        while(running){
            System.out.println("Hello: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}


public class AppBasicSync {

    public static void main(String[] args) {
        Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Press return to stop....");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processor1.shutdown();
    }
}
