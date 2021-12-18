package Homeworks;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        /*
        Write a program in Java to make such a pattern like a pyramid with numbers increased by 1. For this task ask the user to enter a number of the line.
        Example: Please enter line number: 4 Expected output: 1 2 3 4 5 6 7 8 9 10
        Please enter line number: 3 Expected output: 1 2 3 4 5 6
         */
        System.out.println("Enter the number of line");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
}


