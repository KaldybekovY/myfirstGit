package Switch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        based on the name of the shape
        calculate the area of that shape
        get length and width and height of those shapes from user to use them in calculations
        print out name of the shape and area of that shape
        -triangle, rectangle
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle or Rectangle?");
        String shape = scanner.nextLine().toLowerCase();
        switch (shape){
            case "triangle":
                System.out.println("Please enter height of triangle");
                double h = scanner.nextDouble();
                System.out.println("Please enter base of triangle");
                double b = scanner.nextDouble();
                System.out.println("The area of triangle is: "+(b*h)/2);
                break;
            case "rectangle":
                System.out.println("Please enter length of rectangle");
                double l = scanner.nextDouble();
                System.out.println("Please enter width of rectangle");
                double w = scanner.nextDouble();
                System.out.println("The area of rectangle is: "+(l*w));
                break;
            default:
                System.out.println("Please enter proper sizes");
                break;
        }

    }
}
