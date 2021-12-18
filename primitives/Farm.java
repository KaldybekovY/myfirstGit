package primitives;

public class Farm {
    public static void main(String[] args) {
        /*
        in a farm there are 12 cows and 23 chickens
        1-find the total legs of the animals in the farm and print out
        2-if each cow costs $2345 and each chicken costs $23.99
        find the total worth of these animals and print out
         */

        int co1 = 12;
        int result1 = co1 * 4;
        int co2 = 23;
        int result2 = co2 * 2;
        System.out.println(result1+result2);

        double cost1 = 2345;
        double cost2 = 23.99;
        System.out.println(co1*cost1+co2*cost2);

    }
}
