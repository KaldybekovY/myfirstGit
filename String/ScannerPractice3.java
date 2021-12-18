package String;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    // use scanner to
    // get name and of date of birth year of user
    // calculate user's age
    // print "You are <age> years old"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name? ");
        String name = scanner.nextLine();
        System.out.println("Please enter your birth year" );
        int birthYear = scanner.nextInt();

        int age = 2021 - birthYear;
        System.out.println(name + "you are "+age+ "years old");

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);


    }


}
