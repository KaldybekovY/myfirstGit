package Arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int[] zipCode = {61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipCode));

        Arrays.sort(zipCode);// from smaller to larger

        System.out.println(Arrays.toString(zipCode));

        String[] colors = {"violet", "PINK", "RED", "white", "black"};

        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));


    }
}
