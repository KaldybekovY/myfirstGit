package Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {
        char[] ch = {'A', '4', '&', 'z', '3', 'u','*'};

        // by using for each loop, print out letters only
        for(char letters:ch){
            if (letters >='A' && letters<='Z'|| letters >='a' && letters<='z'){
                System.out.println(letters);
            }
        }
        for(char symbol:ch){
            if(Character.isAlphabetic(symbol)){
                System.out.println(symbol);
            }else if (Character.isDigit(symbol)){

            }else{
                System.out.println("This is some symbol"+symbol);
            }
        }
    }
}
