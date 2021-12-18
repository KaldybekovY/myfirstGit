package Homeworks;

import primitives.PrecedencePractice;

import java.util.Scanner;

public class ReplacingA {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to provide String value.
        Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
        Look at example below carefully For example: Input: Success Output: "auccess" "aaccess" “aaacess” "aaaaess" "aaaaass" "aaaaaas" "aaaaaaa" “aaaaaaa”
         */
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        int count=1;
        String a ="";
        while(value.length()+1>count){
            String word=value.substring(count);
            a+="a";
            word=a+word;
            System.out.println(word);
            count++;
        }
    }
}

