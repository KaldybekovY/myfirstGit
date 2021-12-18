package Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int[] studentIDs = new int[5];

        studentIDs[0]=21;
        studentIDs[1]=31;
        studentIDs[2]=41;
//        studentIDs[3]=51;
//        studentIDs[4]=61;

        System.out.println(studentIDs[0]);
//        System.out.println(studentIDs[5]);
        studentIDs[1]=99;
        System.out.println(studentIDs[1]);
//        System.out.println(studentIDs[5]);
        for (int i = 0; i < studentIDs.length; i++){
            System.out.println(studentIDs[i]);
        }
        System.out.println(Arrays.toString(studentIDs));

    }
}
