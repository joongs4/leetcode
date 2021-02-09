package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
    //
    private List<Integer> integerList;
    private int currentIndex = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        //
        this.integerList = new ArrayList<>();
        while (iterator.hasNext()) {
            integerList.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        //
        if (hasNext()) {
            return this.integerList.get(currentIndex);
        }
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (hasNext()) {
            return this.integerList.get(currentIndex++);
        }
        return null;

    }

    @Override
    public boolean hasNext() {
        return this.integerList.size() > this.currentIndex;
    }

    public static void main(String... args) {

        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(2);
        sample.add(3);

        PeekingIterator peekingIterator = new PeekingIterator(sample.iterator());
        int a = peekingIterator.next();
        int b = peekingIterator.peek();
        int c = peekingIterator.next();
        int d = peekingIterator.next();
        boolean hasNext = peekingIterator.hasNext();

        System.out.println("asdasd");

    }
}