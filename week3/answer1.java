package ders1;

import java.util.Scanner;

public class Trial {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter your weight in pounds: "); 
        double weightInPounds = input.nextDouble(); 

        System.out.println("Enter your height in inches: ");
        double heightInInches = input.nextDouble(); 

        double weightInKilograms = weightInPounds * 0.453592;

        double heightInMeters = heightInInches * 0.0254;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.0f\n", bmi);

        if (bmi < 18.5) { 
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) { 
            System.out.println("Normal"); 
        } else if (bmi >= 25.0 && bmi < 30.0) { 
            System.out.println("Overweight"); 
        } else { 
            System.out.println("Obese");
        }
    }
    }