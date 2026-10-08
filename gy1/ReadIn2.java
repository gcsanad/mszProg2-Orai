package gy1_18;

import java.io.Console;

public class ReadIn2 {
    public static void main(String[] args) {
        Console c = System.console();

        while (true) {
            System.out.println("Kerek egy stringet: ");
            String szoveg = c.readLine();
            if (szoveg == null || szoveg.trim().isEmpty()) {break; }
            System.out.println("Ez volt az: " + szoveg);

        }
    }


}
