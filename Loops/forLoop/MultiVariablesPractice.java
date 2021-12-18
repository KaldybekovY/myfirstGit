package Loops.forLoop;

public class MultiVariablesPractice {
    public static void main(String[] args) {
        for (int a = 3, b = 10; a < 8 && b>0 ; a++, b--){

            System.out.println(a);
            System.out.println(b);

        }
        System.out.println("=========");
        int x = 1;
        int y = 5;

        for (;x<10 && y >0;x++,y--){
            System.out.println("Hello");
        }
        System.out.println("==========");

        for (x=1, y=5; x<10 || y >0; x++, y--){
            System.out.println("BYE");

        }
    }
}
