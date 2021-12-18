package primitives;

import java.util.Locale;
import java.util.Scanner;

public class ScannerPractice5 {

    // if the user enter char that is not an English letter
    //code should print false
    //If user enters English letter code should print true
    // asdhfhaffidjpogjsgs
    public static void main(String[] args) {
        // ASCII table
        // The table that all chars has a unique value
        int charValueA = 'a';
        System.out.println(charValueA);
        char a = 97;
        char a2 = 'a';
        System.out.println(a);
        // If value of the char between char a and char z
        // it means this char is a letter
        System.out.println("Please enter a char letter");

        char ch = 'a';
        // if this ch is a letter or not.
        // If the value if the char between char a and char z
        // it means this char is a letter

        boolean isLetter = ch>= 'a'&&ch<='z'||ch>='A'&&ch<='Z';
        System.out.println(isLetter);

        // We will ask user to their first name
        // We will ask user to their last name
        // We will print firstName in lower case
        // last name in upper case in the same line.
        // . toLowerCasse(); == makes the all letters lower case
        // . toUpperCase(); == makes the all letters upper case
        String str = "Yusuf";
        str.toUpperCase();
        // if we don't reassign the string
        // it will not change its value
        System.out.println(str);
        // yusuf
        str = str.toUpperCase();
        System.out.println(str);
        String str1 = "Yernur";
        str1 = str1.toLowerCase();
        String str2 = "Kaldybekov";
        str2 = str2.toUpperCase();
        System.out.println(str1+str2);

    }
}
