package ders1;

import java.util.Random;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("n must be a positive integer.");
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);  
        }
        System.out.print("Generated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] frequency = new int[n]; 
        for (int num : array) {
            frequency[num]++;
        }
        System.out.println("Frequencies:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " appears " + frequency[i] + " times");
            }
        }
    }
}