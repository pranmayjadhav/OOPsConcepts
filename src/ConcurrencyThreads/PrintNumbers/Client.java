package ConcurrencyThreads.PrintNumbers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10); // only 10 thread will be used for all the tasks
        for (int i = 1; i <= 100; i++) {
            PrintNumbers x = new PrintNumbers(i);
//            Thread t = new Thread(x); //for each separate thread for each task
//            t.start();
            ex.execute(x);
        }
    }
}
