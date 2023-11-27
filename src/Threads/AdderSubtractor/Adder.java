package Threads.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;
    public Adder(Value x) {
        this.v = x;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 1000; i++) {
            this.v.value += i;
        }
        return null;
    }



}
