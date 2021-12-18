package String;

import sun.lwawt.macosx.CSystemTray;

import java.util.Locale;

public class Methods3 {
    public static void main(String[] args) {
        String brand = "Nike";

        boolean bl1 = brand.startsWith("N");
        System.out.println(bl1);
        boolean bl2 = brand.startsWith("n");
        System.out.println(bl2);
        System.out.println(brand.startsWith("Nike"));
        System.out.println(brand.startsWith("Nike"));
        System.out.println(brand.endsWith("e"));

    }
}
