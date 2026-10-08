package gy1_18;

import java.util.Arrays;
import java.util.Scanner;

public class feladat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[] szamTomb = new double[5];
        System.out.println("Kerek ot szamot: ");
        for (int i = 0; i < szamTomb.length; i++) {
            szamTomb[i] = reader.nextDouble();

//        double mySum = 0;
//        double myMin = Double.MAX_VALUE;
//        double myMax = Double.MIN_VALUE;

//        for (double szam : szamTomb) {
//            if (szam < myMin) myMin = szam;
//            if (szam > myMax) myMax = szam;
//            mySum += szam;
//        }
//        System.out.println("Min: " + myMin);
//        System.out.println("Max: " + myMax);
//        System.out.println("Sum: " + mySum);
//        System.out.println("Min: " + mySum / szamTomb.length);

            System.out.println("Min : " + Arrays.stream(szamTomb).min());
            System.out.println("Max : " + Arrays.stream(szamTomb).max());
            System.out.println("Sum : " + Arrays.stream(szamTomb).sum());
            System.out.println("Avg : " + Arrays.stream(szamTomb).average().orElse(0));


        }


    }}