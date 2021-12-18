package Homeworks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
         Write a Java program to check whether a given number is an armstrong number or not.
         NOTE: An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits.
         For example, 370 is an Armstrong number since 370 = 333 + 777 + 000 Look at example below carefully.
         Test Data : Input a number: 153 Expected Output :153 is an Armstrong number
         Input a number: 230 Expected Output : 230 is not an Armstrong number
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; num > i; i++) {
            int dig1 = num % 10;
            int num1 = num / 10;
            int dig2 = num1 % 10;
            int num2 = num1 / 10;
            int dig3 = num2 % 10;
            sum = ((dig1 * dig1 * dig1) + (dig2 * dig2 * dig2) + (dig3 * dig3 * dig3));
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

