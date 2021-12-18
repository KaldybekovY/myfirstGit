package Homeworks;

import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {
        /*
         Using the scanner ask the user to enter any String value. If this String has a color like red or blue with lower case print the red or blue.
         Other wise do not print anything. EXAMPLE-1: Input: "xxredyy" Output: red EXAMPLE-2: Input: "xbxltue" Output: blue
         */
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine().toLowerCase();
        if(color.contains("r")&&color.contains("e")&&color.contains("d")){
            System.out.println("red");
        }else if(color.contains("b")&&color.contains("l")&&color.contains("u")&&color.contains("e")){
            System.out.println("blue");
        }else{
            System.out.println(" ");
        }
    }
}
