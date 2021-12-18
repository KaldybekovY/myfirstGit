package String;

public class Concat {
    public static void main(String[] args) {
        String test = "Chicago";
        // String has build methods or functions you can call by using your variable
        test = test.concat(" is the best");

        test = test.concat(" in the summer");
        System.out.println(test);
        test += test.concat(" EVER");
        System.out.println(test);


    }
}
