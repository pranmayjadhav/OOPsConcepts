package ConcurrencyThreads.AdderSubtractor_Mutex;

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
            lock.lock();
            this.v.value += i;
            lock.unlock();
        }
        return null;
    }



}
