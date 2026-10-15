package gy6.PackageAnimals;

import gy6.PackageAbstractAnimals.Pet;

public class Snake implements Pet, Comparable<Snake> {
    private double speedInMeterPerSec;
    private String name;

    public Snake(double speedInMeterPerSec) {
        this.speedInMeterPerSec = speedInMeterPerSec;
    }

    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String makeSound() {
        return "Sssssss";
    }

    @Override
    public int compareTo(Snake o) {
        int v = Double.compare(this.getSpeedInMeterPerSec(), o.getSpeedInMeterPerSec());

        if (v != 0) return v;
        return -1 * this.getName().compareTo(o.getName());
    }
}
