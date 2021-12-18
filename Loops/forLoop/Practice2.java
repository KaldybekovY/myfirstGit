package Loops.forLoop;

public class Practice2 {
    public static void main(String[] args) {
        // print out numbers between 0 to 5 decreasing by using for loop
//        for (int a = 5;a>=0; a--){
//            System.out.println(a);
//        }
//        // find the sum of numbers between 1 to 5 by using for loop
        int sum = 0;
        for (int num = 1 ; num < 5; num++){
            sum +=num;
        }
        System.out.println(sum);
    }
}
