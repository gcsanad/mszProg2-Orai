package gy5v1;

import java.time.LocalDate;

public class Horse implements Animal, MeansOfTransport{
    private double speedInMeterPerSec, weight, carryingCapacityInKg;
    private final String sound = "Nyihaha";
    private final int numberOfLegs = 4;
    private String name, color;
    private LocalDate birthDate;


    public Horse(double speedInMeterPerSec, double weight, double carryingCapacityInKg, String name, String color, LocalDate birthDate) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public double getWeightInKg() {
        return this.weight;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return this.carryingCapacityInKg;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Horse{");
        sb.append("speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append(", weight=").append(weight);
        sb.append(", carryingCapacityInKg=").append(getCarryingCapacityInKg());
        sb.append(", sound='").append(getSound()).append('\'');
        sb.append(", numberOfLegs=").append(getNumberOfLegs());
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", color='").append(getColor()).append('\'');
        sb.append(", birthDate=").append(getBirthDate());
        sb.append(", weightInKg=").append(getWeightInKg());
        sb.append('}');
        return sb.toString();
    }
}
