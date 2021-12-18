package Project5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPrime = true;
        for(int d=num/2; d>1; d--){
            if(num/d==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+ " is a prime number");
        }else{
            System.out.println(num+ " is not a prime number");
        }
    }
}
