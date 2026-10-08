package gy5v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        /*Snail[] snailArr = new Snail[3];

        Snail s1 = new Snail(0.02, 0.1, "normal");
        Snail s2 = new Snail(0.05, 0.1, "normal");
        Snail s3 = new Snail(0.03, 0.1, "normal");

        snailArr[0] = s1;
        snailArr[1] = s2;
        snailArr[2] = s3;

        Arrays.sort(snailArr, new Comparator<Snail>() {
            @Override
            public int compare(Snail o1, Snail o2) {
                return -1 * Double.compare(o1.getSpeedInMeterPerSec(),
                                      o2.getSpeedInMeterPerSec());
            }
        });

        System.out.println("Csigák: ");
        for (Snail s : snailArr){
            System.out.println(s);
        }*/

        Horse h1 = new Horse(10,400,85,
                "Szélvész","Szürke", LocalDate.of(2010, 10, 10));
        Horse h2 = new Horse(10,390,80,
                "Villám","Szürke", LocalDate.of(2010, 10, 10));
        Horse h3 = new Horse(17,400,80,
                "Zeusz","Szürke", LocalDate.of(2010, 10, 10));
        Horse h4 = new Horse(16,400,80,
                "Szigma","Fekete", LocalDate.of(2010, 10, 10));
        Horse h5 = new Horse(10,400,80,
                "Alfonz","Fehér", LocalDate.of(2010, 10, 10));

        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(h1);
        horses.add(h2);
        horses.add(h3);
        horses.add(h4);
        horses.add(h5);

        //horses.sort(new HorseComparator());
        Collections.sort(horses);
        //horses.sort(new HorseComparator2());

        horses.sort(Comparator.comparing(Horse::getColor, Comparator.reverseOrder())
                .thenComparing(Horse::getWeightInKg)
                .thenComparing(Horse::getName, Comparator.reverseOrder()));



        System.out.println("Lovak: ");

        for (Horse h : horses) {
            System.out.println(h);
        }









    }
}
