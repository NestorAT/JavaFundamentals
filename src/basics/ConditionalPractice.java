package basics;

import java.util.Scanner;

public class ConditionalPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Excellent");
        } else if (score > 70 && score < 80) {
            System.out.println("Good");
        } else if (score >= 60 && score <= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}