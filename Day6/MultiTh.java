package Day6;

	public class MultiTh extends Thread {
	    private String Name;  

	    MultiTh(String Name) {
	        this.Name = Name;
	    }

	    public void run() {
	        for (int i = 1; i <= 1; i++) {
	            System.out.println(Name);
	            try {
	                Thread.sleep(500);  
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MultiTh m1 = new MultiTh("Thread1");
	        MultiTh m2 = new MultiTh("Thread2");

	        m1.start();
	        m2.start();
	    }
	}
}
