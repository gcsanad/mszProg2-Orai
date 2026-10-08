package gy5v1;

import java.util.Comparator;

public class HorseComparator implements Comparator<Horse> {


    @Override
    public int compare(Horse o1, Horse o2) {
        int v = (int) (o1.getSpeedInMeterPerSec() - o2.getSpeedInMeterPerSec());

        if (v != 0) return v;

        v = (int) (o1.getCarryingCapacityInKg() - o2.getCarryingCapacityInKg());

        if (v != 0) return v;

        v = o1.getName().compareTo(o2.getName());

        return v;


    }
}
