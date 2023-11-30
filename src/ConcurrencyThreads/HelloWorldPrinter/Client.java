package ConcurrencyThreads.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter x = new HelloWorldPrinter();
//        x.run();
        Thread t = new Thread(x);
        t.start();
        Thread t1 = new Thread(x);
        t1.start();
        System.out.println("HI FROM MAIN FUNCTION " + Thread.currentThread().getName());
    }
}
