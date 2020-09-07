package ua.edu.npu.thread3;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);

        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();

    }
}
