package gy3;

public class Bicycle extends Vehicle{
    private int size;


    public Bicycle(String registrationNumber) {
        super(registrationNumber, 2);
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicycle{");
        sb.append("size=").append(getSize());
        sb.append(", status=").append(getStatus());
        sb.append(", numberOfWheels=").append(getNumberOfWheels());
        sb.append(", id='").append(getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
