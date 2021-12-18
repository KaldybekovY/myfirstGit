package String;

import java.util.Locale;

public class Methods4 {
    public static void main(String[] args) {
        String text = "Selenium";
        // contains(); it will check if the string has given value or not, returns true/false
        text.contains("le");
        boolean result1 = text.contains("le");
        System.out.println(result1);
        System.out.println(text.contains("t"));
        System.out.println(text.contains("selenium"));
        System.out.println(text.contains("1"));
        System.out.println("ium");

        //Equals(); it will check if the given string has exactly same order of char. will return true/false

        System.out.println(text.equals("Selenium"));
        System.out.println(text.equals("nium"));

        //equalIgnoreCase()

        System.out.println(text.equalsIgnoreCase("SELenium"));
        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2));


    }
}
