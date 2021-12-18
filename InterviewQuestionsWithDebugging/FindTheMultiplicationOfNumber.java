package InterviewQuestionsWithDebugging;

import Homeworks.SumOfSeries;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindTheMultiplicationOfNumber {
    public static void main(String[] args) {
        //Write a program that will accept numbers like 578432
        //get the multiplication of the number 5*7*8*4*3*2 -->6720
        // get the sum of the number 5+7+8+4+3+2 -->29
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        //How am i going ti reach out each element from the int
        //I should use the modules(remainder) 10;
        int SumOfmultiplication = 1;
        while (number!=0){
            int digit = number%10;
            number=number/10;//number/=10;
            SumOfmultiplication=digit*SumOfmultiplication;

        }
        System.out.println(SumOfmultiplication);
        // 123 --> 10% --> 3

    }
}
