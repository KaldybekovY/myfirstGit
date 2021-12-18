package primitives;

public class RemainderPractice2<sout> {
    // find the product digits from given number
    // 456 ==> 4*5*6=120 sout ("The product is =" + product);
    public static void main(String[] args) {
    int num = 456;
    int a1 = num % 10;
    num = num / 10;
    int a2 = num % 10;
    num = num / 10;
    int a3 = num % 10;

        System.out.println("The product is= " + (a1*a2*a3));

    }

}
