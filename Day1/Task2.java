package Day1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time (T) in years: ");
        double time = scanner.nextDouble();
        if (principal > 0 && rate > 0 && time > 0) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("The Simple Interest is: " + simpleInterest);
        } else {
            System.out.println("Error: All input values must be positive.");
        }

        scanner.close();
    }
}
