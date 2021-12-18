package IFstatement;

public class IFpractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;
        System.out.println("I am about to create an IF block");
        if (appleNumber==orangeNumber){
            System.out.println("I am so lucky today");
        }
        if (appleNumber != orangeNumber){
            System.out.println("I am so happy today");
        }
        if (appleNumber<=orangeNumber){
            int sum = appleNumber+orangeNumber;
            System.out.println("You have "+sum+" fruits");
        }
        System.out.println("So far so good");

        if (appleNumber>=orangeNumber){
            System.out.println(orangeNumber*appleNumber+ " is in false conditional if block. That's why it won't show on the console");
        }
    }
}
