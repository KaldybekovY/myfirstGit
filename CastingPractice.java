public class CastingPractice {
    public static void main(String[] args) {

        int number1 = 23;

        long l1 = number1; // implicit casting is happens by java

        short sh1 = (short)number1;

        byte by1 = 1;

        byte by2 = 2;

        // short sum1 = by1 + by2; compile time error

        short sum2 = (short)(by1+by2);

        int price = (int)750.99;
        System.out.println(price);
        double samsung = 900.45;
        int priceSamsung = (int)samsung;
        System.out.println(priceSamsung);


    }
}
