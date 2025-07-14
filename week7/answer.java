package ders1;

import java.util.Random;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("which operation do you want to do?"); 
            System.out.println("1- Write all even numbers between an interval"); 
            System.out.println("2- Generate and printout a random matris"); 
            System.out.println("3- Generate a password and printout");
            System.out.println("0- for exit"); 
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("write two integers as boundaries"); 
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    printEvenNumbers(x1, y1);
                    break;
                case 2:
                    System.out.println("write two integers as matrice size");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    printRandomMatrice(x2, y2);
                    break;
                case 3:
                    System.out.println("how much lenght password should be");
                    int length = scanner.nextInt();
                    String password = generatePassword(length);
                    System.out.println("password: " + password);
                    break;
                case 0:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println(); 
        } while (choice != 0);
        scanner.close();
    }
    public static void printEvenNumbers(int x, int y) {
        int start = Math.min(x, y);
        int end = Math.max(x, y);
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printRandomMatrice(int x, int y) {
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(random.nextInt(10) + " "); 
            }
            System.out.println();
        }
    }
    public static String generatePassword(int x) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]}\\|;:',<.>/?`~";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}