package Day2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        int charCount = 0;
        for (String word : words) {
         charCount += word.length();
        }
        String longestWord = "";
        for (String word : words) {
         if (word.length() > longestWord.length()) {
          longestWord = word;
            }
        }
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }
        System.out.println("Word count: " + wordCount);
        System.out.println("Character count (no spaces): " + charCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Reversed sentence: " + reversed);
        sc.close();
    }
}


