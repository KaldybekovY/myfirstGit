package Loops.While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice1 {
    public static void main(String[] args) {
        //Ask user to enter an integer value and find the divisors of the given number

        //10-->1,2,5,10
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive whole number");
        int number = scanner.nextInt();
        int divisor = 1;
        while (divisor<=number) {
            if (number % divisor == 0) {
                System.out.println(divisor + " is divisor of " + number);
            }
            divisor++;
        }
    }
}
