package Homeworks;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }
}
