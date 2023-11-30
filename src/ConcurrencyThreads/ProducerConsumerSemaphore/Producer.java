package ConcurrencyThreads.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore conSema;

    public Producer(Store store, Semaphore prodSema, Semaphore conSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.conSema = conSema;
    }

    @Override
    public void run() {
        while(true){

            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            conSema.release();

        }
    }
}
