package String;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        String name = "David";
        System.out.println("My name is "+name);
    //creating Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city name");
        String lastName = input.nextLine();
        System.out.println(lastName);
        System.out.println("Please enter your city name");
        String city = input.nextLine();
        System.out.println(name + " " +lastName+" you are living in"+city);
        lastName = "XXXXXX";
        System.out.println(lastName);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(name + "your age is very good age. That is>>" + age);

    }
}
