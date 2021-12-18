package Project3;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop and Country.Please enter the music type? ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Classical") || answer.equalsIgnoreCase("Pop") || answer.equalsIgnoreCase("Country")) {
            if (answer.equalsIgnoreCase("Classical")) {
                System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets are available songs");
            }
            System.out.println("Which one do you want to listen? ");
            String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("Four Seasons") || answer2.equalsIgnoreCase("Fur Elise") || answer2.equalsIgnoreCase("Finlandia") || answer2.equalsIgnoreCase("Vocalise") || answer2.equalsIgnoreCase("The Planets")) {
                System.out.println("Please enter 2$ for this song");
                int classic = 2;
                scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                if (number<classic) {
                    System.out.println(answer2 + " is playing. Enjoy the song!");
                    int number2 = scanner.nextInt();
                    number += number2;
                    if(number==classic){
                        System.out.println(answer2+" is playing. Enjoy your song");
                    } else if(classic<number){
                        System.out.println("You have entered" + (number-classic)+ "dollar more. Please wait for change" + answer2+"is playing.Enjoy your song.");
                    }
                }
            }else{
                System.out.println("Name of song is not available");
            }
        }else{
            System.out.println("Type of musics is not available");
    }
    }
}





