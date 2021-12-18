package Loops.While_DoWhile;

public class PhoneCallTask {
    public static void main(String[] args) {
        /*
          -you $40 in your international phone calling account
          -if every call you make costs $5
          -find out and print: how many total calls you can make with your balance of $40
           ex. print out --> "you can make <...> calls with your balance"
         */
        int total = 40;
        int cost = 5;
        int count = 0;
        while(total>0){
            total -= cost;
            count++;
            System.out.println("This many calls you can make "+count);
            int calls = total/cost;
            System.out.println(calls);

        }
    }
}
