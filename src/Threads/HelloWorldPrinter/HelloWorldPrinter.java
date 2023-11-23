package Threads.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{

    public void doSomething() {
        System.out.println("Do Something" + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hi From Run method" + Thread.currentThread().getName());
        doSomething();
    }
}
