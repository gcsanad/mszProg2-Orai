package gy3;

import java.util.Objects;

public class Vehicle {
    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle(String id) {
        this.status = VehicleStatus.PARK;
        this.id = id;
    }

    public Vehicle(String id, int numberOfWheels) {
        this.status = VehicleStatus.PARK;
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }



    public void setMove() {
        this.status = VehicleStatus.MOVE;
    }

    public void setStop() {
        this.status = VehicleStatus.STOP;
    }

    public void setPark() {
        this.status = VehicleStatus.PARK;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("status=").append(status);
        sb.append(", numberOfWheels=").append(numberOfWheels);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.id == vehicle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
