package Ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a = 2, b = 3;
        // ?    :
        String result1 = a < b ? "Hello" : "Bye";
        //  a<b ? a*b : "Text"; --> to be able to store the result of ternary both options have to be same data type
        System.out.println(a<b? "Hello" : "Bye");
        boolean result3 = a>=b? a==b : a<b;
        System.out.println(result3);
        int result4 = 'a' < 'Z'? 5 + 6 + 7 : 7 - 4 - 1;
        System.out.println(a);
        String str = "David";
        String result5 = str.substring(3).equals("id") ? str.toLowerCase().concat(" is number") : str.toUpperCase().concat(" is String");
        System.out.println(result5);
        System.out.println(str.equalsIgnoreCase("DAVID")? str.substring(3).toUpperCase():str.substring(3).toLowerCase());
    }
}

