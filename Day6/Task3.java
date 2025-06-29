package Day6;

class Worker extends Thread {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " started.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " finished.");
    }

    public static void main(String[] args) {
        Worker t1 = new Worker("Thread 1");
        Worker t2 = new Worker("Thread 2");
        Worker t3 = new Worker("Thread 3");

        System.out.println("Starting threads...");

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t2.start();
        try {
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t3.start();

        try {
            t3.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads completed.");
    }
}
