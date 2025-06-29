package Day2;
	import java.util.Scanner;
	public class Task3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();
	        String[] words = sentence.split(" "); // split by space
	        System.out.println("Words in the sentence:");
	        for (String word : words) {
	            System.out.println(word);
	        }
	        sc.close();
	    }
	}
