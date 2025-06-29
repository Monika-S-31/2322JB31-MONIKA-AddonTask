package Day6;

public class Post {
    private int balance;

    public Post(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String user, int amount) {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw $" + amount);
        if (balance >= amount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " successfully withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw $" + amount + ". Insufficient balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Post account = new Post(100);

        Thread user1 = new Thread(() -> account.withdraw("User-1", 60), "User-1");
        Thread user2 = new Thread(() -> account.withdraw("User-2", 50), "User-2");
        Thread user3 = new Thread(() -> account.withdraw("User-3", 30), "User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}

