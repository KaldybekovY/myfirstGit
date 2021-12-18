package Loops.forLoop;

import java.util.Locale;

public class PalindromePractice {
    public static void main(String[] args) {
        // efe, 1234321, civic, ana
        // if the given string
        String str = "Civic".toLowerCase();
        String reverse = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            reverse = reverse + str.charAt(index);
        }
        if(reverse.equals(str)){
            System.out.println("Your name is Palindrome");
        }else{
            System.out.println("Your name is not Palindrome");
        }
        //find out if given number is palindrome or not
    }
}
