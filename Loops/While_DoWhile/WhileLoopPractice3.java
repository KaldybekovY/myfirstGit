package Loops.While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print out every letter from given string separated by coma ");
        String word = scanner.nextLine();
        // get a string from user and print out every letter from given string separated by comma
            int i = 0;
            while (i<word.length()){
                System.out.print(word.charAt(i)+ ",");
                i++;
            }
            int lindex = word.length()-1;
            while (lindex>=0){
                System.out.print(word.charAt(lindex)+", ");
                lindex--;
            }
        }
    }
    // print those letters from end to beginning




