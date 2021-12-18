package primitives;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first exam score (1 - 100):");
            int exam1 = scanner.nextInt();
            System.out.println("Please enter second exam score (1 - 100):");
            int exam2 = scanner.nextInt();
            System.out.println("Please enter third exam score (1 - 100):");
            int exam3 = scanner.nextInt();
            double examsaverage = exam1 * 0.2+exam2 * 0.3+exam3 * 0.5;
            System.out.println(examsaverage);
            System.out.println("Please enter your attendance percentage:");
            int attendance = scanner.nextInt();
            int reqAve = 65;
            int reqAttend = 80;
            boolean result = examsaverage >= reqAve && attendance >= reqAttend;
            System.out.println(result);
    }
}
