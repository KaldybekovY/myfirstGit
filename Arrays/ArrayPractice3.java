package Arrays;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] numbers = {4,3,6,7,11,45};
        System.out.println(numbers[3]);
//        numbers[6]=66;

        numbers[1]=88;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
        System.out.print(Arrays.toString(numbers));
        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]);
    }
}
