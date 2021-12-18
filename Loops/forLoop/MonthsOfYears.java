package Loops.forLoop;

public class MonthsOfYears {
    public static void main(String[] args) {
        /*
        print out months for the years between 2020 to 2023
        2020->1,2,3...12
         */
        for (int years = 2020; years <= 2023; years++) {
            System.out.print(years + "-->");
            System.out.println();
            for (int months = 1; months <= 12; months++) {
                System.out.print(months + " ");
                if (months == 1) {
                    System.out.println("January");
                }
                if (months == 2) {
                    System.out.println("February");
                }
                if (months == 3) {
                    System.out.println("March");
                }
                if (months == 4) {
                    System.out.println("April");
                }
                if (months == 5) {
                    System.out.println("May");
                }
                if (months == 6) {
                    System.out.println("June");
                }
                if (months == 7) {
                        System.out.println("July");
                }
                if (months == 8) {
                        System.out.println("August");
                }
                if (months == 9) {
                        System.out.println("September");
                }
                if (months == 10) {
                        System.out.println("October");
                }
                if (months == 11) {
                        System.out.println("November");
                }
                if (months == 12) {
                        System.out.println("December");
                    }
                }
            }
        }
    }





