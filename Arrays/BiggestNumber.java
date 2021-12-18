package Arrays;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 5};
        //find the biggest number
        int sum = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]>sum){
                sum = arr[i];
            }
        }
        System.out.println(sum);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);
    }
}
