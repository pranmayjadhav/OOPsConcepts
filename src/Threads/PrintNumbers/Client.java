package Threads.PrintNumbers;

public class Client {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            PrintNumbers x = new PrintNumbers(i);
            Thread t = new Thread(x);
            t.start();
        }
    }
}
