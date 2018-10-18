package thread;

import java.util.Date;

public class RunnableDemo2 implements Runnable {

    private static volatile boolean active;

    private Thread t;
    private String threadName;

    RunnableDemo2(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        active = true;
        while (active) // 第一行
        {
            try {
                if ("Thread-1".equals(threadName)) {
                    System.out.println("Thread: " + threadName + new Date().toString());
                    // 让线程睡眠一会
                    Thread.sleep(500);
                }

                if ("Thread-2".equals(threadName)) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread: " + threadName + "---" + i);
                        Thread.sleep(500);
                    }
                    stop();
                }

            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }

        }
    }

    public void stop() {
        active = false;
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunnableDemo2 R1 = new RunnableDemo2("Thread-1");
        R1.start();

        RunnableDemo2 R2 = new RunnableDemo2("Thread-2");
        R2.start();
    }

}