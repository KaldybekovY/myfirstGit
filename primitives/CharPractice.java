package primitives;

public class CharPractice {

    public static void main(String[] args){

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println("A");
        System.out.println('A');
        ch1 = '5'; //re-assigment-->from ASCII table, 5 = 53
        System.out.println(ch1);
        System.out.println(ch1*2);
        char ch2 = ch1;
        System.out.println(ch2);
        char ch3 = '&';
        System.out.println(ch3);
        char ch4 = 80;
        System.out.println(ch4);
        // char ch5 = 'ye'; you can not assign more than one character in single quotation mark

        int numberChar = 'T';
        System.out.println(numberChar);


    }
}
