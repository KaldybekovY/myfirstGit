package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        /*
        -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array that is called 'names'
        -print them out by using ->Arrays.toString(); method
         */
        Scanner scanner = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("How many names do you want to store in array? ");
        int num = scanner.nextInt();
        String[] names = new String[num];
        for (int a=0; names.length<a; a++ ){
            System.out.println("enter" + (a+1) + ". name");
            names[a]= str.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
