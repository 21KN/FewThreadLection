package ua.edu.npu.thread4;

public class App {
    public static void main(String args[]) {
        Q q = new Q();

        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();
    }
}
