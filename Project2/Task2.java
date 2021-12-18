package Project2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of quarters ");
        double quarters = scanner.nextInt();
        System.out.println("Please enter the number of dimes ");
        double dimes = scanner.nextInt();
        System.out.println("Please enter the number of nickels ");
        double nickels = scanner.nextInt();
        System.out.println("Please enter the number of pennies ");
        double pennies = scanner.nextInt();
        double totalAmount = (nickels*5+pennies*1+dimes*10+quarters*25)/100;
        System.out.println(totalAmount);
        System.out.println("please give the total amount of dollars");
        double total = scanner.nextDouble();
        double amountQ = total%25;
    }
}
