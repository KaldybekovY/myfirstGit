package IFstatement;

public class ElseTask1 {
    public static void main(String[] args) {
//        when your order total is more than $1000 you get %20 discount, otherwise you get %5 discount
//        calculate and print total discount and payment in each case
       double total = 1200;
        if (total>=1000){

            System.out.println("Your total discount is: "+total*0.20);
            System.out.println("Your payment after discount is "+(total-(total*0.2)));
        } else
            System.out.println("Your total discount is "+total*0.05);
            System.out.println("Your payment after discount is " + (total-(total*0.05)));
    }
}
