package gy6.PackageAbstractAnimals;

import java.util.ArrayList;

public abstract class PetMammal implements Pet, Vertebrates{
    private String name;
    private int numberOfLegs;
    private String home;

    protected PetMammal(String name, int numberOfLegs, String home) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.home = home;
    }

    public abstract ArrayList<String> getActivityList();


    protected String getHome() {
        return this.home;
    }

    protected void setHome(String home) {
        this.home = home;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public int compareTo(Vertebrates o) {
        int v = (int)(this.getNumberOfLegs() - o.getNumberOfLegs());

        if (v != 0)return v;

        if (!(o instanceof PetMammal)) return v;

        return this.getName().compareTo(((PetMammal) o).getName());

    }

}
