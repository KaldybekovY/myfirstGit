package Loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        // print out every letter from the string
        // print index number of the letter and * together with the letter >> 0*t 1*o
        String str = "Today is Snowy";
//        for ( int index = 0; index < str.length(); index++){
//            System.out.println(index+"*"+str.charAt(index));
//        }
        // print out only letter 'y' from the string
//        for ( int index = 0; index < str.length(); index++){
//            if (str.charAt(index) == 'y')
//                System.out.println(str.charAt(index)+""+index);
//        }
        //count the number of letter 'n' in the given String
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == 'n') {
                count++;
            }
        }
        System.out.println(count);
    }
}
