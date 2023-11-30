package ConcurrencyThreads.ProducerConsumer;

public class Producer implements Runnable{
    private Store store;
    Producer(Store st) {
        this.store = st;
    }
    @Override
    public void run() {
        while(true){

            if(store.getItems().size() < store.getMaxSize()) {
                System.out.println("Cleared production check");
                store.addItem();
            }

        }
    }
}
