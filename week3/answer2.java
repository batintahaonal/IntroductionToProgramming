package ders1;
import java.util.Scanner;
public class Trial {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 System.out.println("Choose operation:"); 
     System.out.println("1 for addition"); 
     System.out.println("2 for subtraction"); 
     System.out.println("3 for multiplying"); 
     System.out.println("4 for dividing"); 
     
     int choice = input.nextInt(); 

     System.out.println("Enter two numbers"); 
     double number1 = input.nextDouble(); 
     double number2 = input.nextDouble(); 

     double result = 0; 

     switch (choice) {
         case 1: 
             result = number1 + number2;
             break;
         case 2: 
             result = number1 - number2;
             break;
         case 3: 
             result = number1 * number2;
             break;
         case 4: 
             if (number2 != 0) {
                 result = number1 / number2;
             } else {
                 System.out.println("Error: Division by zero is not allowed."); 
                 return; 
             }
             break;
         default: 
             System.out.println("Invalid operation choice."); 
             return; 
     }
     System.out.printf("result = %.0f\n", result); 
     input.close();
 }
}

