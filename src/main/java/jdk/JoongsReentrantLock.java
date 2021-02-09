package jdk;

import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;

public class JoongsReentrantLock {





    public static void main(){
        ReentrantLock reentrantLock = new ReentrantLock();

        reentrantLock.lock();
        TreeMap<String, String> a = new TreeMap<>();
    }
}
