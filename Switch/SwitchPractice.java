package Switch;

public class SwitchPractice {
    public static void main(String[] args) {

        int number = 123;

        switch (number){

            case 100:
                System.out.println("this is first case");
                break;
            case 110:
                System.out.println("This is second case");
            case 120:
                System.out.println("This is third case");
            case 123:
                System.out.println("This is fourth case");
                break;
            case 130:
                System.out.println("This is fifth case");
                break;
            default:
                System.out.println("This is default case");
                break;

        }
    }
}
