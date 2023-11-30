package ConcurrencyThreads.ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        for(int i = 1; i<=100; ++i){
            ex.execute(new Producer(store, prodSema, consSema));
        }
        ExecutorService ex1 = Executors.newCachedThreadPool();
        for(int i = 1 ; i <=5; ++i){
            ex1.execute(new Consumer(store, prodSema, consSema));
        }
    }
}
