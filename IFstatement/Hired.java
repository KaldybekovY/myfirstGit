package IFstatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        /*
        nested if >>>> java>selenium>API>Sql>Appium ornegi
  ask user:
        -s/he knows Java yes/no
                yes: ask s/he knows Selenium

                        can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congrat!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does she know Java? yes/no");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Yes")){
            System.out.println("Does she have selenium experience? yes/no/learn");
            String selenium = scanner.nextLine();
            if (selenium.equalsIgnoreCase("yes") || selenium.equalsIgnoreCase("learn")){
                System.out.println("Do you have API testing experience");
                String api = scanner.nextLine();
                if(api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have SQL knowledge? yes/no");
                    String sql = scanner.nextLine();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("You're hired");
                }else{
                    System.out.println("We need someone with SQL knowledge");
                }
            }else{
                    System.out.println("We need someone with API knowledge");
                }
        }else{
                System.out.println("We need someone with Selenium knowledge");
            }
    }else{
            System.out.println("You should learn at least one programmimg language");
        }
}
}