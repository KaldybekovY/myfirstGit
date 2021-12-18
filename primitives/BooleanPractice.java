package primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        boolean isHungry = true;

        System.out.println(isHungry);

        boolean isLighon = false;

        System.out.println(isLighon);
        System.out.println(true);
        System.out.println(isHungry == isLighon);
        isLighon = isHungry;
        isLighon = false;
        System.out.println(isHungry);



    }






}
