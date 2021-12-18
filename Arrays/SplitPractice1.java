package Arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str = "Stay safe and Healthy";

        String[] words = str.split(" ");

        System.out.println(str);
        System.out.println(Arrays.toString(words));
        // print out every single word as: ....***
        for(String every:words){
            System.out.println(every.concat("***"));
        }
    }
}
