package jdk;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class JoongsLinkedBlockingQueue {

    public static void main(String... args) throws InterruptedException {


        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.put("");
        linkedBlockingQueue.take();


        ReentrantLock a = new ReentrantLock();
        a.lock();
        a.lockInterruptibly();
    }
}
