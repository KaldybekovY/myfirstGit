package primitives;

public class UnirayPractice1 {
    public static void main(String[] args) {
    int studentNumber = 25;
        System.out.println(studentNumber);

        studentNumber = ++studentNumber;
        System.out.println(studentNumber++);
        int count = 5;
        System.out.println(++count);
        System.out.println(count++);

        int number = 8;
        System.out.println(number--);//will show 8 but actual is 7
        System.out.println(number--); //shows 7 but actual is 6
        System.out.println(--number); // it is 5

        number++;
        System.out.println(number++ + number++); // 13
        System.out.println(number);
        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result);

        int a = ++number;
        System.out.println(a);


    }
}
