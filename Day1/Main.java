package Day1;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        double a, b;
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter your choice (1-4): ");
	        choice = scanner.nextInt();
	        System.out.print("Enter first number: ");
	        a = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        b = scanner.nextDouble();
	        switch (choice) {
	            case 1:
	                System.out.println("Result: " + add(a, b));
	                break;
	            case 2:
	                System.out.println("Result: " + sub(a, b));
	                break;
	            case 3:
	                System.out.println("Result: " + mul(a, b));
	                break;
	            case 4:
	                if (b != 0)
	                    System.out.println("Result: " + div(a, b));
	                else
	                    System.out.println("Cannot divide by zero.");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }

	        scanner.close();
	    }

	    public static double add(double x, double y) {
	        return x + y;
	    }
	    public static double sub(double x, double y) {
	        return x - y;
	    }
	    public static double mul(double x, double y) {
	        return x * y;
	    }
	    public static double div(double x, double y) {
	        return x / y;
	    }
	}


