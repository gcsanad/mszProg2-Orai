package gy5v1;

public class Snail implements Animal{
    private double speedInMeterPerSec, weight;
    private final String sound = "";
    private final int numberOfLegs = 0;
    private String snailType;

    public Snail(double speedInMeterPerSec, double weight, String snailType) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
        this.snailType = snailType;
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

    public String getSnailType() {
        return this.snailType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Snail{");
        sb.append("speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append(", weight=").append(weight);
        sb.append(", sound='").append(getSound()).append('\'');
        sb.append(", numberOfLegs=").append(getNumberOfLegs());
        sb.append(", snailType='").append(getSnailType()).append('\'');
        sb.append(", weightInKg=").append(getWeightInKg());
        sb.append('}');
        return sb.toString();
    }
}
