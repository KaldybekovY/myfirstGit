package Homeworks;

import java.util.Scanner;

public class LoopMultiplicationTable {
    public static void main(String[] args) {
        /*
        Using Scanner ask user to provide any int number and print multiplication table of given number
        Please make sure your output exactly look like given example below.
        EXAMPLE:
        Input number: 5 Output : 5 1 = 5 5 2 = 10 5 3 = 15 5 4 = 20 5 5 = 25 5 6 = 30 5 7 = 35 5 8 = 40 5 9 = 45 5 10 = 50
         */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 1;
        while (number<=10){
            int result = input*number;
            System.out.println(input+"*"+number+"="+result);
            ++number;
        }
    }
}
