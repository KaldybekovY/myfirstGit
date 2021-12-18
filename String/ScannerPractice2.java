package String;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // BMI calculation = weight(kg) / (height*height(meter));
        // 18-24
        // "your BMI is <BMI>"

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your weight in kg ");
        scanner.nextDouble();
        double weight = scanner.nextDouble();
        System.out.println("please enter your height in meters");
        double height = scanner.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("Your BMI is "+ BMI);






    }
}
