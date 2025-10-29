package multithreading;
/*
Why multithreading?
-> To process a task more efficiently
-> Complete CPU utilization
 */

class MyThread implements Runnable {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " finished");
    }
}

public class Multithreading {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread("A"));
        Thread t2 = new Thread(new MyThread("B"));

        t1.start();
        t2.start();
    }
}
