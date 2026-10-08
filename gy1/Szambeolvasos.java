package gy1_18;

import java.util.Scanner;

public class Szambeolvasos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double[] szamTomb = new double[5];

        System.out.println("Kerek ot darab szamot: ");

        for (int i = 0; i < szamTomb.length; i++) {
                szamTomb[i] = reader.nextDouble();
            //String szoveg = reader.nextLine();
            //szamTomb[i] = Double.parseDouble(szoveg);
        }

        for (double szam : szamTomb){
            System.out.println(szam);
        }

    }
}
