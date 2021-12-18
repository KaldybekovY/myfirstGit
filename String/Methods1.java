package String;

public class Methods1 {
    public static void main(String[] args) {
        String device = "microphone";

        device.concat(" is an input device");
        System.out.println(device);
        char ch = device.charAt(1);
        device.length();
        System.out.println(ch);
        int letterscount = device.length();
        System.out.println(letterscount);
        device +=" is expensive";
        System.out.println("device");
        device.concat ("device");
        System.out.println(device.length());
        device = device.concat(" device");
        System.out.println(device.length());
        System.out.println(device.charAt(29));

        String example = "hosted by the Wikimedia Foundation, a non-profit organization that also hosts a range of other projects.";
        char lastChar = example.charAt(example.length()-1);
        System.out.println(lastChar);
        // find the middle char from last string

        char middleChar = example.charAt(example.length()/2);
        System.out.println(middleChar);

        String school = "Techtorial";
        char middle = school.charAt(school.length()/2);
        System.out.println(middle);


    }
}
