package ders1;
import java.util.Random;
import java.util.Scanner;
public class Trial {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Random rand = new Random();

     System.out.print("Enter number of correct midterm answers (0-5): ");
     int midtermCorrect = input.nextInt();
     while (midtermCorrect < 0 || midtermCorrect > 5) {
         System.out.print("Invalid input. Please enter a value between 0 and 5: ");
         midtermCorrect = input.nextInt();
     }

     System.out.print("Enter number of correct quiz answers (0-20): ");
     int quizCorrect = input.nextInt();
     while (quizCorrect < 0 || quizCorrect > 20) {
         System.out.print("Invalid input. Please enter a value between 0 and 20: ");
         quizCorrect = input.nextInt();
     }
     System.out.print("Enter final exam grade (0-100): ");
     int finalGrade = input.nextInt();
     while (finalGrade < 0 || finalGrade > 100) {
         System.out.print("Invalid input. Please enter a value between 0 and 100: ");
         finalGrade = input.nextInt();
     }
     int inClassPerformance = rand.nextInt(100) + 1;

     double midtermScore = midtermCorrect * 20;   
     double quizScore = quizCorrect * 5;     

     double totalGrade = (midtermScore * 0.25) + (quizScore * 0.15) + (finalGrade * 0.50) + (inClassPerformance * 0.10);

     String letterGrade;
     String description;

     if (finalGrade < 50) {
         letterGrade = "F";
         description = "Fail";
     } else if (totalGrade >= 90) {
         letterGrade = "A";
         description = "Successful";
     } else if (totalGrade >= 80) {
         letterGrade = "B";
         description = "Successful";
     } else if (totalGrade >= 65) {
         letterGrade = "C";
         description = "Successful";
     } else if (totalGrade >= 50) {
         letterGrade = "D";
         description = "Conditional pass";
     } else {
         letterGrade = "F";
         description = "Fail";
     }

     System.out.println("\n--- Grade Report ---");
     System.out.println("Midterm Score: " + midtermScore + " / 100");
     System.out.println("Quiz Score: " + quizScore + " / 100");
     System.out.println("Final Exam Grade: " + finalGrade + " / 100");
     System.out.println("In-class Performance: " + inClassPerformance + " / 100");
     System.out.printf("Total Grade: %.2f / 100\n", totalGrade);
     System.out.println("Letter Grade: " + letterGrade);
     System.out.println("Description: " + description);
 }
}

