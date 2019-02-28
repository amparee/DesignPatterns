package Composite;

import java.util.Iterator;
import java.util.function.Consumer;

public class DineMenuIterator implements Iterator {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
