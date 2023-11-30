package ConcurrencyThreads.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore conSema;
    public Consumer(Store store, Semaphore prodSema, Semaphore conSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.conSema = conSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                conSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }

}
