package primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        //there is an event for kids
        // if the age child is 6 or less or if the height of child is 48 or less
        // the event is free for that child
        int reqAge = 6;
        int reqHeight = 48;

        int actAge = 6;
        int actHeight = 55;

        boolean isFree = reqAge >= actAge || reqHeight >= actHeight;
        System.out.println(isFree);

        // find out if student can pass a class
        // there are three tests taken 60, 100, 85
        // average of those tests has to be more than 70 or more
        // attendance rate of the student has to be 80 or more
        // can Pass or not


        int reqAve = 70;
        int reqAttend = 80;

        int studentAve = (60+100+85)/3;
        int studentAttend = 100;
        boolean canPass = reqAve <= studentAve && reqAttend <= studentAttend;
        System.out.println(canPass);




    }
}
