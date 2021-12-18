package Arrays;

public class ForEachPractice1 {
    public static void main(String[] args) {

        double[] checks = {2540, 10000, 100000, 65.50, 1.99};
        // by using each loop, find out and print the total amount of checks
        double total = 0;
        for(double check:checks){
            total+=check;
        }
        System.out.println(total);
    }
}
