package Scheduler;

public class ThreadBasicsDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting 5 threads manually...\n");

        for (int i = 1; i <= 5; i++) {
            int threadNum = i; // must be final/effectively final to use inside the thread

            Thread worker = new Thread(() -> {
                for (int count = 1; count <= 5; count++) {
                    System.out.println("Thread-" + threadNum + " -> count " + count);
                    try {
                        Thread.sleep(100); // simulate work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });

            worker.start(); // starts running concurrently, NOT one-by-one
        }

        System.out.println("Main thread has submitted all 5 workers and keeps going...");
    }
}