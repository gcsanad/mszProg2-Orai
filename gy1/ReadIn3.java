package gy1_18;
import java.util.Scanner;

public class ReadIn3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String szoveg;
        System.out.println("Kerek egy stringet: ");
        while (reader.hasNextLine()) {

            szoveg = reader.nextLine();
            if (szoveg == null || szoveg.trim().isEmpty()) break;
            System.out.println("Ez volt az: " + szoveg);
            System.out.println("Kerek egy stringet: ");

        }
    }
}
