package MentoringWithAhmet.InterviewQuestionWithDebugging;

import java.util.Scanner;

public class ReverseTheWordsandNumbers {
    public static void main(String[] args) {
        // Ask user to input any word and reverse it
        // Ask user to input number and reverse it
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word? ");
        String word= scan.nextLine();
        String name = "";
        for(int i=word.length()-1; i>=0; i--){
            name += word.charAt(i);
        }
        System.out.println(name);
    }
}
