package Homeworks;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to provide starting and ending numbers.
        Print the numbers divisible by 3 and 5 between given number AND ONLY print count of those numbers which is divisible by 3 and 5.
         EXAMPLE: First number: 5 Second number: 65 Output: 4
         //-> Because between 65 and 5 there is only 4 number divisible by 3 and 5 which
         //-> are 15 30 45 and 60 but in this task please do not print anything else just the
         // count of number which are divisible by 3 and 5.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int first = scanner.nextInt();
        System.out.println("Enter a ending number");
        int second = scanner.nextInt();
        int count = 0;
        while (first<=second){
           if (first%3==0&&first%5==0){
               count++;
           }
           first++;
            }
        System.out.println(count);
        }
    }

