package Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 5};
        // find the sum of numbers from array
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]<10){
//                System.out.println(arr[i]);
                sum=arr[i]+sum;
            }
        }
        System.out.println(sum);
    }
}
