package Switch;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class  SwitchNested {
    public static void main(String[] args) {
        /*
        1- IT dept
        David, Tima
        2- Admin
        Alex, Jessi
        3- Customer Care
        Zac, Ana, John
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who do you want to speak with? please select from following options"+"\n1-" +
                "IT Department\n2-" +
                "Admin\n3- Customer Care");
        int dept = scanner.nextInt();
        switch (dept){
            case 1:
            System.out.println("You are in IT dept, Who do want to speak with?Please enter name: David, Tima");
            scanner = new Scanner(System.in);
            String name = scanner.nextLine().toLowerCase();
            switch (name){
                case "david":
                    // want to differ morning and afternoon hours
                    int hour = LocalDateTime.now().getHour();
                    if (hour>8 && hour < 12){
                        System.out.println("I am still not in the office");
                    }else if(hour>22 && hour<17){
                        System.out.println("Hello this is David");
                    }else{
                        System.out.println("this is not a good time");
                    }
                    System.out.println(hour);
                    System.out.println("Hello.This is David");
                    break;
                case "tima":
                    System.out.println("Hello.This is Tima");
                    break;
                default:
                    System.out.println("We don't have " + name);
                    }
                    break;
            case 2:
                System.out.println("You are in Admin dept, Who do want to speak with?Please enter name: Alex, Jessi");
                scanner = new Scanner(System.in);
                String name1 = scanner.nextLine().toLowerCase();
                switch (name1){
                    case "alex":
                        System.out.println("Hello.This is Alex");
                        break;
                    case "jessi":
                        System.out.println("Hello.This is Jessi");
                        break;
                    default:
                        System.out.println("We don't have " + name1);
                }
                break;

            case 3:
                System.out.println("You are in Customer Care dept, Who do want to speak with?Please enter name: Zac, Ana, John");
                scanner = new Scanner(System.in);
                String name2 = scanner.nextLine().toLowerCase();
                switch (name2){
                    case "zac":
                        System.out.println("Hello.This is Zac");
                        break;
                    case "ana":
                        System.out.println("Hello.This is Ana");
                    case "john":
                        System.out.println("Hello.This is John");
                        break;
                    default:
                        System.out.println("We don't have " + name2);
                        break;
                }
                break;
            default:
                System.out.println("Your selection is not valid for department number");
                break;
        }
        }
    }

