package jdk;

public class JoongsConcurrentHashMap {

    private int count;


    public void increase() {
        synchronized (this) {
            for (int i = 0; i < 10000000; i++) {
                String threadName = Thread.currentThread().getName();
                count++;
                System.out.println(threadName + " increase count " + count);
            }

        }

    }

    public void decrease() {
//        synchronized (this) {
            for (int i = 0; i < 10000000; i++) {
                String threadName = Thread.currentThread().getName();
                count--;
                System.out.println(threadName + " decrease " + count);
            }
//        }
    }


    public static void main(String... args) throws InterruptedException {

        JoongsConcurrentHashMap j1 = new JoongsConcurrentHashMap();

        Thread t1 = new Thread() {
            @Override
            public void run() {
//                synchronized (j1) {
//                    for (int i = 0; i < 1000000; i++) {
//                        j1.increment();
//                    }
//                }
                j1.increase();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
//                for (int i = 0; i < 1000000; i++) {
//                    j1.increment();
//                }
                j1.decrease();
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final count is " + j1.count);
    }
}
