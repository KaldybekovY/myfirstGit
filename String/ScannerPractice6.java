package String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerPractice6 {

    public static void main(String[] args) {
        // -deposit money for David
        //	create a new class: MoneyTransaction
        //	David wants to deposit hispaychecks into his account and already has $200
        //	He has 3 paychecks (610, 385, 975)
        //	he can only deposit one check at a time
        //	*Ask: "How much is Deposit amount?" every time he is making deposit
        //	after all of paycheks deposited in to account
        //	he bought a phone for $599 and headphone for $299
        //	*Ask: How much is phone?
        //	*Ask: How much is headPhone?
        //	Calculate his final money and print --> "Your final balance is <finalAmount>"

        double balance = 200;
        Scanner input = new Scanner(System.in);
        System.out.println("How much is Deposit amount");
        double firstCheck = input.nextDouble();
        balance += firstCheck;
        System.out.println("How much is Deposit amount");
        double secondCheck = input.nextDouble();
        balance += secondCheck;
        System.out.println("How much is Deposit amount");
        double thirdCheck;
        System.out.println("How much is phone");
        double phone$ = input.nextDouble();
        balance -= phone$;

        System.out.println("How much is headPHone");
        double headphone$ = input.nextDouble();
        balance -= headphone$;
        System.out.println("Your final balance is "+balance);
    }
}
