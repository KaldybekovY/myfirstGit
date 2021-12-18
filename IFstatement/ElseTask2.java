package IFstatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        // find out if your zip code is even number or odd number
        Scanner sc = new Scanner(System.in);
        int zip = sc.nextInt();
        if (zip%2==0) {
            System.out.println("Your zip is even ");
        } else {
            System.out.println("Your zip is odd ");
        }
    }
}
