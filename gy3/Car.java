package gy3;

public class Car extends Vehicle{
    private boolean engineIsWorking;
    private int horsepower;


    public Car(String licensePlate) {
        super(licensePlate);
        this.engineIsWorking = true;
    }

    public Car(String licensePlate, int horsepower) {
        super(licensePlate);
        this.horsepower = horsepower;

    }




    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isEngineWorking() {
        return engineIsWorking;
    }

    public void setEngineToWork() {
        this.engineIsWorking = true;
    }

    public void setEngineToStop() {
        this.engineIsWorking = false;
    }

    @Override
    public void setMove() {
        super.setMove();
        this.engineIsWorking = true;
    }

    @Override
    public void setStop() {
        super.setStop();
        this.engineIsWorking = true;
    }

    @Override
    public void setPark() {
        super.setPark();
        this.engineIsWorking = false;
    }
}
