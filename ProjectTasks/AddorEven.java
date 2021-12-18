package ProjectTasks;

import java.util.Scanner;

public class AddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade in letter.");
        String lettergrade = "";
        lettergrade = input.next();
        double value = 0;
        if (lettergrade.equals("A")){
            System.out.println(4.0);
        }else if (lettergrade.equals("A-")){
            System.out.println(3.7);
        }else if (lettergrade.equals("B+")){
            System.out.println(3.3);
        }else if (lettergrade.equals("B")){
            System.out.println(3.0);
        }else if (lettergrade.equals("B-")){
            System.out.println(2.7);
        }else if (lettergrade.equals("C+")){
            System.out.println(2.3);
        }else if (lettergrade.equals ("C")){
            System.out.println(2.0);
        }else if(lettergrade.equals("C-")){
            System.out.println(1.7);
        }else if (lettergrade.equals("D+")){
            System.out.println(1.3);
        }else if (lettergrade.equals("D")){
            System.out.println(1.0);
        }else if (lettergrade.equals("F")){
            System.out.println(0.0);
        }
    }
}




