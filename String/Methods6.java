package String;

public class Methods6 {
    public static void main(String[] args) {
        String name = "    Techtorial Academy    ";
        // trim()---> it will remove spaces before and after string

        String updatedname = name.trim();
        System.out.println(updatedname);

        // subString()

        String part1 = updatedname.substring(4);
        System.out.println(part1);
        String part2 = updatedname.substring(4,11); //the char at the first index is included but char at the second index is not included
        System.out.println(part2);
    }
}
