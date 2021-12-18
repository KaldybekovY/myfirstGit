package ProjectTasks;

import java.util.Scanner;

public class Project2Task6 {
    public static void main(String[] args) {
        /*
        Using a scanner enter three different ingredients for the product on the same line. Then ask the user to enter any int number. Change the first letter of the ingredients starting from the entered number. (Ingredients should start with different letters. Please read the example carefully ) Example 1:
        Please enter three ingredients with spaces: Milk Peanuts Butter
        Please enter the int number:
        5
        The output is:
        5ilk 6eanuts 7utter
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter three different ingredients with spaces: ");
//        String ingredients = scanner.nextLine();
//        String str1 = ingredients.substring(0, ingredients.indexOf(" "));
//        //System.out.println(str1);
//        String str2 = ingredients.substring(str1.length()+1, ingredients.indexOf(" ", ingredients.indexOf(" ")+1));
//        //System.out.println(str2);
//        int indspace = ingredients.indexOf(" ", ingredients.indexOf(" ")+1);
//        //System.out.println(indspace);
//        String str3 = ingredients.substring(indspace +1);
//        //System.out.println(str3);
//        System.out.println(str1.substring(0,1) + str2.substring(0,1) +str3.substring(0,1) );
//        System.out.println("Please enter the int number: ");
        System.out.println("Enter 3 ingredients");
        String ing= scanner.nextLine();
        System.out.println("Enter one digit");
        int digit= scanner.nextInt();

        String ing2=ing.substring(0, ing.indexOf(" "));
        //String ing3=ing.substring(ing.indexOf(" ")+1,);
        String twoWord=ing.substring(ing.indexOf(" ")+1,ing.length());
        String ing3=twoWord.substring(0, twoWord.indexOf(" "));
        String ing4=twoWord.substring(twoWord.indexOf(" ")+1, twoWord.length());

        String ch=digit +ing2.substring(1,ing2.length());
        String ch2=digit+1+ing3.substring(1,ing3.length());
        String ch3=digit+2+ing4.substring(1,ing4.length());
        System.out.println(ch+" "+ch2+" "+ch3);


        }
    }
