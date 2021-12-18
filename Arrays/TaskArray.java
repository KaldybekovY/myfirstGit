package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        /*
        -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array
        if the name has 5 or more letters store it in 'longNames' array
        if the name has less than 5 letters store it on 'shortNames' array
        -print both array by using -->Arrays.toString(); method
         */
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        System.out.println("How many names do you want to store? ");
        int number = sc.nextInt();
        String[] names = new String[number];
        String[] longNames = new String[number];
        String[] shortNames = new String[number];
        for (int a=0; a<number; a++){
            System.out.println("Enter"+(a+1)+". name");
            names[a] = str.nextLine();
            if (names[a].length()>=5){
                longNames[a]=names[a];
            }else{
                shortNames[a]=names[a];
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
