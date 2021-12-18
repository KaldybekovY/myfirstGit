package IFstatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {
        System.out.println("What city are you from?");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")){
        System.out.println("What course are you in?");
        if (scanner.nextLine().equalsIgnoreCase("techtorial")){
                    System.out.println("What batch are you in?");
                    if (scanner.nextLine().equalsIgnoreCase("batch 11")){
                }else{
                        System.out.println("Join batch 11");
                    }
        }else{
            System.out.println("Please visit us at Techtorial");
        }
        }else{
            System.out.println("Please come to Chicago");
        }
        }
}
