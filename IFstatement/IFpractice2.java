package IFstatement;

import java.util.Scanner;

public class IFpractice2 {
    public static void main(String[] args) {
        // assume that user is using military style time 1-24
        // print out good morning / good afternoon
        // for the hours of morning or afternoon
        // ask user to enter only hour for the time
        // if the hour is less than 12 print good morning
        // if the hour is more than 12 less than 18 print good afternoon
        // if the hour is more than 18 print good evening
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<12 && num>=0) {
            System.out.println("Good morning");
        }
        if(num<=12 && num<18) {
            System.out.println("Good afternoon");
        }
        if(num>=18 && num <24) {
            System.out.println("Good evening");
        }
    }
}
