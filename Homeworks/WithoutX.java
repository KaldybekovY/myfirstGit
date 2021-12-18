package Homeworks;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', print the string without those 'x' chars, and otherwise print the string unchanged. Examples:
        "xHi" → "Hi" "Hxi" → "Hi" "Tesxt" → "Testxt"
         */
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String one = value.substring(0, 2);
        String two = value.substring(2);
        if(value.contains("x")){
            one = one.replace("x", "");
            System.out.println(one+two);
        }else{
            System.out.println(one);
        }
    }
}
