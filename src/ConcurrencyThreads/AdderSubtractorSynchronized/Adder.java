package ConcurrencyThreads.AdderSubtractorSynchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;
    public Adder(Value x, Lock y) {
        this.v = x;
        this.lock = y;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 1000; i++) {
            synchronized (v) {
                this.v.value += i;
            }
        }
        return null;
    }



}
