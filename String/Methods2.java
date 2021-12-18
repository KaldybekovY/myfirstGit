package String;

import java.util.Locale;

public class Methods2 {
    public static void main(String[] args) {
        String flower = "Rose";
        int indexofR = flower.indexOf('R');
        int indexofR1 = flower.indexOf("R");
        System.out.println(indexofR);
        System.out.println(indexofR1);
        System.out.println(flower.indexOf("o"));
        System.out.println(flower.indexOf("os"));
        System.out.println(flower.indexOf("o,s")); //if it doesn't find matching char/char sequence it will return -1
        System.out.println(flower.indexOf("r")); //-1
        System.out.println(flower.indexOf("Rose"));
        System.out.println(flower.indexOf("rose"));

        String object = "umbrellam";
        System.out.println(object.indexOf('l')+1);
        System.out.println(object.indexOf('l',7));
        System.out.println(object.indexOf('m',object.indexOf('m')+1));
        String sentence = "I love Lilies";
        System.out.println(sentence.indexOf('l')+1);
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

        // toUppercase()-->makes your string as Uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.charAt(3));
        // think about making single letter uppercase from a string
        String str = "Just do it";

        // indexof()-->returning number
        // charAt()-->returning char

        char letter = str.charAt(str.indexOf("d"));

        String str2 = "";
        str2 +=letter;
        System.out.println(str2.toUpperCase());


    }
}
