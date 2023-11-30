package ConcurrencyThreads.AdderSubtractor_Mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Value v = new Value();
        Adder x = new Adder(v, lock);
        Subtractor y = new Subtractor(v, lock);
        ExecutorService ec = Executors.newCachedThreadPool();

        Future<Void> adderFuture = ec.submit(x);
        Future<Void> subtractorFuture = ec.submit(y);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);

    }
}
