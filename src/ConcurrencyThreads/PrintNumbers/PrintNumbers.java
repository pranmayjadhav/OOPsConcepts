package ConcurrencyThreads.PrintNumbers;

public class PrintNumbers implements Runnable {
    private int number;
    public PrintNumbers(int x) {
        number = x;
    }

    public void run() {
        System.out.println(number + " " + Thread.currentThread().getName());
    }
}
