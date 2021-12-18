package Loops.While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        // ask user to provide a whole integer number
        // create a multiplication table 1 to 10 from the given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number ");
        int number = scanner.nextInt();
        int number1 = 1;
        while(number1<=10){
                System.out.println(number + " * "+number1+ " = " +(number*number1));
            number1++;
        }
    }
}
