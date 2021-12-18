package Loops.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        // reverse given string
        String str = "Let's do it";
        String reverse = "";
        for (int index = str.length()-1; index >= 0; index--) {
            reverse = reverse + str.charAt(index);
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
