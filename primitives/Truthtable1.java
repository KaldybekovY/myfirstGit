package primitives;

public class Truthtable1 {
    public static void main(String[] args) {
        // visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel = visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);

        // ask question
        boolean online = true;
        boolean campus = true;

        boolean student = true;
        boolean askQuestion = student == online || student == campus;
        System.out.println("Can i ask question? "+askQuestion);

        // 90% or more attendance and score of 80 and more to pass this class
        int att = 90;
        int sco = 80;

        int yourAtt = 91;
        int yourSco = 100;

        boolean pass = yourAtt >= att && yourSco >= sco;
        System.out.println(pass);

        //


    }
}
