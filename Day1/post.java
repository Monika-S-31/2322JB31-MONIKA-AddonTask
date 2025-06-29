package Day1;

import java.util.Scanner;

public class post {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double subjectMarks = sc.nextDouble();
            totalMarks += subjectMarks;
        }

        double averageMarks = totalMarks / numSubjects;
        String grade = calculateGrade(averageMarks);
        printResult(averageMarks, grade);

        sc.close();
    }

    public static String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void printResult(double marks, String grade) {
        System.out.println("Average Marks: " + marks);
        System.out.println("Grade: " + grade);

        if (grade.equals("F")) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }
    }
}
