package Arrays;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names = new String[6];
        names[5]="David";
        names[3]="Dinara";
        names[2]="Mary";
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);
        // show all values from the 'names' array one by one
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
    }
}
