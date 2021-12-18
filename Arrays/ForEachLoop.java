package Arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {45,23,5,7,21,66,100};
        // print out each element from this array by using each loop
        for(int num: numbers){
            System.out.println(num);
        }
        String[] flowers = {"Lily", "Rose", "Orchid", "violet", "tulip"};
        for(String flower:flowers){
            System.out.println(flower);
        }

    }

}
