package primitives;

public class Homework {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int total = a++ + ++a + --b + ++b + b + ++a + ++b - --b +a;
        System.out.println(total);
    }
}
