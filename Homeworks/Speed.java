package Homeworks;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        /*
        The user using a scanner enters the current speed and target speed .
        In every 1-sec car's speed will increase 10mil.
        Please find the total number of sec to reach your target speed using a while loop.
         Example: CurrentSpeed: 6 Target Speed: 20 Output: 2. -> Because in two seconds user can reach the target speed.
         */
        Scanner scanner = new Scanner(System.in);
        int current = scanner.nextInt();
        int target = scanner.nextInt();
        int sec = 0;
        int total = target/10;
        while (sec<=total) {
            if (target>sec*10){
                System.out.println(target/10);
            }
           sec++;
        }
    }
}


