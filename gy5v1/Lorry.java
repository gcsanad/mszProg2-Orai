package gy5v1;

public class Lorry implements MeansOfTransport{
    private double speedInMeterPerSec, carryingCapacityInKg, weight, enginePowerInKw;
    private int numberOfWheels;

    public Lorry(double speedInMeterPerSec, double carryingCapacityInKg, double weight, double enginePowerInKw, int numberOfWheels) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
        this.enginePowerInKw = enginePowerInKw;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return this.carryingCapacityInKg;
    }

    @Override
    public double getWeightInKg() {
        return this.weight;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    public double getEnginePowerInKw() {
        return enginePowerInKw;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lorry{");
        sb.append("speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append(", carryingCapacityInKg=").append(getCarryingCapacityInKg());
        sb.append(", weight=").append(weight);
        sb.append(", enginePowerInKw=").append(getEnginePowerInKw());
        sb.append(", numberOfWheels=").append(getNumberOfWheels());
        sb.append('}');
        return sb.toString();
    }
}
