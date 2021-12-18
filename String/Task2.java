package String;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        // ===Task==
        //String str = " Zero to Ten  ";
        //- change 'Ten' with/to 'HERO'
        //- make all of the string uppercase
        //- remove all spaces
        //- get only first three letter
        //- print the length of those three letters as ==> "The length of final version is: +  <length>"
        String str = " Zero to Ten ";
        System.out.println(str.replace("Ten", "Hero"));
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.replace(" ", ""));
        System.out.println(str.substring(0,4));
        String str1 = str.substring(0,4);
        System.out.println(str1.length());

        // method chaining ==> you can use method after method

        str = " Zero to Ten ";
        System.out.println(str.replace("Ten", "HERO").toUpperCase().trim().replace(" ","").substring(0,3).length());


    }
}
