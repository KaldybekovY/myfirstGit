package IFstatement;

import java.util.Scanner;

public class IFpractice1 {
    public static void main(String[] args) {
        // get a number between from 1 to 7 from user
        // print the name of the day for that given number from user
        // 1 --> Monday
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7 ");
        double a = scanner.nextDouble();
        int number = (int)a;
        if(a==1) {
            System.out.println("Monday");
        }
        if(a==2) {
            System.out.println("Tuesday");
        }
        if(a==3) {
            System.out.println("Wednesday");
        }
        if(a==4) {
            System.out.println("Thursday");
        }
        if(a==5) {
            System.out.println("Friday");
        }
        if(a==6) {
            System.out.println("Saturday");
        }
        if(a==7) {
            System.out.println("Sunday");
        }
        // if the user enters out of range number
        // print your number is out of range
        if(a>7 || a<1) {
            System.out.println("Out of range number ");
        }
    }
}
