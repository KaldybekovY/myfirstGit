package Arrays;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {

        char[] ch = {'A', '4', '&', 'z', '3', 'u','*'};
        char[] others = new char[ch.length];
        int count = 0;
        for(int a=0; a<ch.length;a++){
            if (ch[a]>='0' && ch[a]<='9'){
                System.out.println(ch[a]);
                count++;
            }else{
                others[a]=ch[a];
            }
        }
        System.out.println(Arrays.toString(others));
        Arrays.sort(others);
        System.out.println(Arrays.toString(others));
    }
}
