package Day6;


class MessagePrinter implements Runnable {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }
    
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + message);
    }

    public static void main(String[] args) {
        
        Runnable task1 = new MessagePrinter("Hello from Thread 1");
        Runnable task2 = new MessagePrinter("Hello from Thread 2");
        Runnable task3 = new MessagePrinter("Hello from Thread 3");
        
        Thread thread1 = new Thread(task1, "One");
        Thread thread2 = new Thread(task2, "Two");
        Thread thread3 = new Thread(task3, "Three");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
