package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        // modulus -->%--> remainder (left over division)

        int number1 = 45;
        int number2 = 6;

        int remainder1 = number1 % number2;
        System.out.println(remainder1);

        // Find the sum of digits from given number
        // 123 ---> 1+2+3 = 6 ==> sout (sum is >> <sum>)

        int myNumber = 123;
        int digit3 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = myNumber % 10;
        myNumber = myNumber / 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit1 + digit2 + digit3);





    }
}
