package gy5v1;

import java.util.Comparator;

public class HorseComparator2 implements Comparator<Horse> {
    //Sebesseg forditott, nev novekvo, tomeg forditott
    @Override
    public int compare(Horse o1, Horse o2) {
        int v = -1 * ((int) (o1.getSpeedInMeterPerSec() - o2.getSpeedInMeterPerSec()));

        if (v != 0) return v;

        v = o1.getName().compareTo(o2.getName());

        if (v != 0) return v;

        return -1 * ((int) (o1.getWeightInKg() - o2.getWeightInKg()));


    }
}
