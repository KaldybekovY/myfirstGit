package Loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {
        // Print hours and minute for twelve hours of a day
        // ex. 00:00, 00:01 ... 0:59 01:00 01:01 01:02...........11:59
        Outer:
        for(int a=0; a<12; a++){
            System.out.println();
            for(int b=0; b<=59; b++) {
                for(int c=0; c<=59; c++){
                    System.out.println(a+":"+b+":"+c);
                    break Outer;
                }
            }
        }
    }
}
