package ders1;

import java.util.Scanner;

public class Trial {
    public static boolean isPrime(int n) {
        if (n <= 1) {
			return false;
		}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
				return false;
			}
        }
        return true;
    }
    public static int toDigitSum(int num) {
        if (num < 10) {
			return num;
		}
        return num / 10 + num % 10;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 16-character account number: ");
        String account = input.nextLine();

        if (account.length() != 16) {
            System.out.println("Invalid: Account number must be 16 characters.");
            return;
        }

        char first = account.charAt(0);
        char second = account.charAt(1);
        if (!Character.isUpperCase(first) || !Character.isUpperCase(second) || first >= second) {
            System.out.println("Invalid: First two letters must be capital and first < second.");
            return;
        }

        String twoDigitStr = account.substring(2, 4);
        if (!Character.isDigit(twoDigitStr.charAt(0)) || !Character.isDigit(twoDigitStr.charAt(1))) {
            System.out.println("Invalid: Characters 3 and 4 must be digits.");
            return;
        }

        int twoDigitNumber = Integer.parseInt(twoDigitStr);
        if (!isPrime(twoDigitNumber)) {
            System.out.println("Invalid: The two-digit number after letters must be prime.");
            return;
        }

        String last12 = account.substring(4, 16);
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 11; i >= 0; i--) {
            int digit = Character.getNumericValue(last12.charAt(i));
            if ((11 - i) % 2 == 0) {  
                int doubled = digit * 2;
                sumEven += toDigitSum(doubled);
            } else {  
                sumOdd += digit;
            }
        }

        int total = sumEven + sumOdd;
        if (total % 10 == 0) {
            System.out.println("Valid account number.");
        } else {
            System.out.println("Invalid: Checksum failed.");
        }
    }
}