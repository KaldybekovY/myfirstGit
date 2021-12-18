package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {
        // there is an event for kids if a child's height is 48 or more they can attend this event
        // print out the result if kid can attend or not

        int height = 48;
        int kidsheight = 46;

        boolean attend = height <= kidsheight;
        System.out.println(attend);

        // if the age of child 6 or less it will be free

        int reqAge =6;
        int kidAge = 7;

        boolean isFree = kidAge <= reqAge;
        System.out.println(isFree);

        boolean truth = height <= kidsheight || kidAge<=reqAge;

    }



}
