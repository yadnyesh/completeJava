package yb.yadnyesh.udemy.cop;

public class AppSynchronized {

    private int count = 0;

    //Synchronized method, need to acquire intrinsic lock, that can be held by only 1 thread
    public synchronized void increment() {
        count++;
    }


    public static void main(String[] args) {
        AppSynchronized app = new AppSynchronized();
        app.doWork();
    }

    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is: " + count);
    }
}
