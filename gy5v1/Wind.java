package gy5v1;

public class Wind implements Move {
    private String direction;
    private double speedInMeterPerSec;

    public Wind(double speedInMeterPerSec, String direction) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.direction = direction;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return this.speedInMeterPerSec;
    }

    public String getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wind{");
        sb.append("direction='").append(getDirection()).append('\'');
        sb.append(", speedInMeterPerSec=").append(getSpeedInMeterPerSec());
        sb.append('}');
        return sb.toString();
    }
}
