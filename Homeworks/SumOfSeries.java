package Homeworks;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
        Here the number n will come from user so if user gives number 3 you should find sum of 1 + 11 + 111. Please look carefully example below.
        Test Data : Input the number of terms : 5 Expected Output : 12345 (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)
         */
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0, j = 1;
            for (int i = 1; i <= n; i++)
            {
                sum = sum + j;
                j = (j * 10) + 1;
            }

            System.out.println(sum);
        }

        }

