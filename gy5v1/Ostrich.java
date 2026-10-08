package gy5v1;

import java.time.LocalDate;

public class Ostrich implements Animal, MeansOfTransport{
    private double speedInMeterPerSec, weight, carryingCapacityInKg;
    private final String sound = "Bleep";
    private final int numberOfLegs = 2;
    private String name, featherPattern;
    private LocalDate birthDate;

    public Ostrich(double speedInMeterPerSec, double weight, double carryingCapacityInKg, String name, String featherPattern, LocalDate birthDate) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.name = name;
        this.featherPattern = featherPattern;
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

    public String getFeatherPattern() {
        return this.featherPattern;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ostrich{");
        sb.append("speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append(", weight=").append(weight);
        sb.append(", carryingCapacityInKg=").append(getCarryingCapacityInKg());
        sb.append(", sound='").append(getSound()).append('\'');
        sb.append(", numberOfLegs=").append(getNumberOfLegs());
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", featherPattern='").append(getFeatherPattern()).append('\'');
        sb.append(", birthDate=").append(getBirthDate());
        sb.append(", weightInKg=").append(getWeightInKg());
        sb.append('}');
        return sb.toString();
    }
}
