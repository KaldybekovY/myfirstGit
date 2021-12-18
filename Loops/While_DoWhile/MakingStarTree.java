package Loops.While_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        /*
        -Ask user to provide a number between 3 to 10
        -make a star tree for that many line
        (Use Do-While Loop to implement solution)
        ex: input --> 4
         */
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int x = 0;
        String star = "*";
        do{
            star +="*";
            System.out.println(star);
            x++;
        }while(number>x);
        System.out.println("*");
    }
}
