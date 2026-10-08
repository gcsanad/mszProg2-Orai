package gy5v1;

public class Frog implements Animal{
    private double speedInMeterPerSec, weight;
    private final String sound = "Brekeke";
    private final int numberOfLegs = 4;


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

    public Frog(double speedInMeterPerSec, double weight) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Frog{");
        sb.append("speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append(", weight=").append(weight);
        sb.append(", sound='").append(getSound()).append('\'');
        sb.append(", numberOfLegs=").append(getNumberOfLegs());
        sb.append('}');
        return sb.toString();
    }
}
