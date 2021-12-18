package IFstatement;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IFpractice3 {
    // ask user to enter a single word
    // if the word's first letter is M --> there is a day starts with M >> Monday
    // T --> Tuesday/Thursday
    // W --> Wednesday
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single word ");
        String word = scanner.nextLine().toUpperCase();
        if (word.startsWith("M")) {
            System.out.println("Monday");
        }
        if (word.startsWith("T")) {
            System.out.println("Tuesday");
        }
        if (word.startsWith("W")) {
            System.out.println("Wednesday");
        }
        if (word.startsWith("T")) {
            System.out.println("Thursday");
        }
        if (word.startsWith("F")) {
            System.out.println("Friday");
        }
        if (word.startsWith("S")) {
            System.out.println("Sunday");
        }
        if (!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") && !word.startsWith("F") && word.startsWith("S")){
            System.out.println("There is no day!!!");

        }
    }
}
