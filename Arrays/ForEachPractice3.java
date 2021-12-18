package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPractice3 {
    public static void main(String[] args) {

        String[] names = {"John", "Brian", "Easy", "Nina", "David"};
            //create email address for each of the names in the array
            //john@gmail.com
            //store these e-mails in an array
        // if its gmail e-mail, store it in gmail array
        // if its yahoo e-mail, store it in yahoo array
        String[] gmails= new String[names.length];
        String[] yahoos = new String[names.length];
            for(String name:names){
                String email = name+"gmail.com";
                String ymails = name.toUpperCase().concat("@yahoo.com");
                System.out.println(name.concat("@gmail.com"));
                System.out.println(name.toUpperCase().concat("@yahoo.com"));
            }
        System.out.println("***************");

            for(int i=0; i< names.length; i++){
                gmails[i]= names[i]+"@gmail.com";
                yahoos[i] = names[i].toUpperCase().concat("@yahoo.com");
            }
        System.out.println(Arrays.toString(gmails));
        System.out.println(Arrays.toString(yahoos));
        }
    }

