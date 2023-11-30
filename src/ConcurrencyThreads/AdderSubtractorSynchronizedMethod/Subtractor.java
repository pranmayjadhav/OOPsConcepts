package ConcurrencyThreads.AdderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Subtractor(Value x, Lock y) {
        this.v = x;
        this.lock = y;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 1000; i++) {
            this.v.decrementBy(i);
        }
        return null;
    }
}
