package Switch;

import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 from user and print out name of a season as:
        1->Winter
        2->Spring
        ...
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print out number between 1-4 to select a season");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("There is no such a season");
        }
    }
}
