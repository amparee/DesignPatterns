package Adapter;

import java.util.Iterator;
import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(0,10).forEach( t -> turkey.fly() );
    }

    Iterator iterator;
}
