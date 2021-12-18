package Loops.While_DoWhile;

public class CountingChars {
    public static void main(String[] args) {
        /*
        count letters, digits and other characters in the String
        String str = "jhdjf2hsd3jhfsj9hs"
        sout("There are <..> letters in the string");
        sout("There are <..> digits in the string");
         */
        String str = "jdshfsdhgl*$shl33kd".toUpperCase();
        int index = 0;
        int letterCounter=0;
        int lettercounter = 0, digitcounter = 0, charcounter = 0;

        do{
            if (str.charAt(index)>='A'&&str.charAt(index)<='Z'){
                letterCounter++;
            }else if(str.charAt(index)>='0'&&str.charAt(index)<='9') {
                digitcounter++;
            }else{
                charcounter++;
            }
            index++;
        }while(index<str.length());
        System.out.println("There are "+letterCounter+" letters in the string");
        System.out.println("There are "+digitcounter+" digits in the string");
        System.out.println("There are "+charcounter+" chars in the string");

    }
}
