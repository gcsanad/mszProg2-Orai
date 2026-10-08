package gy2;

import java.io.Console;
import java.util.Scanner;

public class Haromszoges {
    public static void main(String[] args) {
        System.out.println("Kérem a háromszög oldalait ;-vel elválasztva: ");
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextLine()) {
            String input = reader.nextLine();
            if(!input.contains(";")){
                System.out.println("Azt mondtam ;-vel!");
                continue;
            }
            String[] oldalak = input.split(";");
            if (oldalak.length < 3){
                System.out.println("Több/kevesebb oldalt adtál meg!");
                continue;
            }
            if (oldalak.length > 3){
                System.out.println("Legyen... de csak az első 3 lesz");
            }
            double aOldal = Double.parseDouble(oldalak[0]);
            double bOldal = Double.parseDouble(oldalak[1]);
            double cOldal = Double.parseDouble(oldalak[2]);
            if (aOldal + bOldal > cOldal && cOldal + aOldal > bOldal && bOldal + cOldal > aOldal){
                System.out.println("Készíthető háromszög!");

                if (aOldal > cOldal){
                    double tmp = cOldal;
                    cOldal = aOldal;
                    aOldal = tmp;
                }
                if (bOldal > cOldal){
                    double tmp = cOldal;
                    cOldal = bOldal;
                    bOldal  = tmp;
                }
                if (Math.pow(aOldal, 2) + Math.pow(bOldal, 2) == Math.pow(cOldal, 2)){
                    System.out.println("Derékszögű a háromszög!");
                }
                else if (Math.pow(aOldal, 2) + Math.pow(bOldal, 2) > Math.pow(cOldal, 2)){
                    System.out.println("Hegyesszögű a háromszög!");
                }
                else{
                    System.out.println("Tompaszögű a hűromszög!");
                }
            }
            else{
                System.out.println("Nem készíthető háromszög!");
            }
            System.out.println("Kérem a háromszög oldalait ;-vel elválasztva: ");
        }
    }
}
