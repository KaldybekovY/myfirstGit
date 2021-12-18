package primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte b1 = 12;


        short sh1 = b1;

        short sh2 = 3;

        // byte b2 = sh2; compile time error, you can not store larger data type into smaller data type

        byte b2 = 2;
        int result2 = b1 + b2;
        int i1 = 4;
        double d1 = i1;
        // int 12 = d1; compile time error

        double d4 = 1.2;
        // float result4 = f1 + d4;
        // double result5 = f1 + d4; // numeric promotion happens and java promotes to the larger data type





    }
}
