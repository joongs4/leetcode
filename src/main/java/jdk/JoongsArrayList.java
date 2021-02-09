package jdk;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class JoongsArrayList<T extends Class> {


    private final int DEFAULT_SIZE = 10;
    private int allowableSize = DEFAULT_SIZE;
    private Object[] array;

    public JoongsArrayList() {
        array = new Object[DEFAULT_SIZE];
    }


    public void add(T t) {
        if (array.length >= allowableSize) {
            Queue<String> a = new LinkedBlockingQueue<>();
        }
    }

    public void clear() {

    }

    public void remove(int index) {

    }

}
