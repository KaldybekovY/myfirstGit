package IFstatement;

public class IFcurlyBracketPractice {
    public static void main(String[] args) {
        int number = 1234;
        if (number == 1234)
            System.out.println("Number is equals 1234");
            System.out.println("Number is not equals to 1234");

            if (number==5)
                System.out.println("Hello World");
                System.out.println("hello JAVA");

                int num1=6;
                if (num1<10)
                    num1++;
        System.out.println(num1); //7

        int num2=4;
        if (num2>20);
        num2++;
        System.out.println(num2);

        if (num2>20){
            num2++;
            System.out.println("i am in the curly braces "+num2);
        }
        int a=9;
        if (1==1)
            a = 2+2;
        System.out.println("=========");
        System.out.println(a);
    }
}
