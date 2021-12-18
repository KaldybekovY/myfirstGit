package primitives;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        // Ask user to enter an integer number
        // We will find out if this is an even number or not
        // Input is 7
        // Output 7 is even number false
        // input is 8
        // Output 8 is even number true

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer number");
//        int number = scanner.nextInt();
//        // if remainder with 2 gives 0 this number will be even
//        // otherwise it is odd
//        boolean isEven = number%2 == 0;
//        System.out.println(number+" is even number "+isEven);

        // Ask user to enter two integer number
        // First integer you provide should be bigger than second one.
        // we will print out    true
        // if second number bigger than the first number
        // we will print out false/

//        System.out.println("enter your first integer number");
//        int firstNumber = scanner.nextInt();
//
//        System.out.println("please enter an integer but smaller than first one");
//        int secondNumber = scanner.nextInt();
//
//        boolean isFirstBigger = firstNumber>secondNumber;
//        System.out.println(isFirstBigger);

        // To be able  to graduate from school
        // student needs
        // %85 attendancy
        // 80 or higher grade
        // %70 of homework
        // create a program for teacher
        // teacher will enter all these variables and
        // if student fails you will print false for teacher

        System.out.println("Attendancy");
        int attendancy = scanner.nextInt();
        System.out.println("Grade" );
        int grade = scanner.nextInt();
        System.out.println("Homework" );
        int homework = scanner.nextInt();

        boolean isPass = attendancy>=85 && grade>=80&& homework>=70;
        System.out.println(isPass);


    }
}
