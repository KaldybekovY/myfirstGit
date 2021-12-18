package IFstatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        // get three test results from user and calculate the average of those three tests based on the average score:
        // print out letter grade for this student
        // average-->100-90-->your letter grade is A
        // average is -->89-80-->your letter is B
        //                -->79 - 60--> ........C
        //                 --> less than 60-->you should take the course again
        int test1 = 90;
        int test2 = 99;
        int test3 = 100;
        int avg = (test1 + test2 + test3) / 3;
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade should be A");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Grade should be B");
        } else if (avg >= 60 && avg <= 79) {
            System.out.println("Grade should be C");
        } else if (avg <= 60) {
            System.out.println("You should take another course");
        }
    }
}
