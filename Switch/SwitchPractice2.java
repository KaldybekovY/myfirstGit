package Switch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        /*
        Ask user for his/her favorite fruit
        there are: mango, banana, kiwi, orange, apple, grape
        if you have user's favorite fruit -->We have your favorite fruit in our store
        otherwise: Sorry, we don't have your favorite fruit:(
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite fruit?");
        String fruit = scanner.nextLine().toLowerCase();
        switch (fruit){
            case "mango":
                System.out.println("We have your fruit");
                break;
            case "banana":
                System.out.println("We have your fruit");
                break;
            case "kiwi":
                System.out.println("We have your fruit");
                break;
            case "orange":
                System.out.println("We have your fruit");
                break;
            case "apple":
                System.out.println("We have your fruit");
                break;
            case "grape":
                System.out.println("We have your fruit");
                break;
            default:
                System.out.println("There are no such a fruit");
        }

    }
}
