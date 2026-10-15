package gy6.PackageAnimals;

import gy6.PackageAbstractAnimals.PetMammal;
import gy6.PackageAbstractAnimals.ProtectedAnimal;

import java.util.ArrayList;

public class GilaMonster extends PetMammal implements ProtectedAnimal {
    private String lawNumber;


    public GilaMonster(String name, String lawNumber) {
        super(name, 4, "Odahaza");
        this.lawNumber = lawNumber;
    }


    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> activityList = new ArrayList<>();
        activityList.add("Napozik");
        activityList.add("Hűsöl");
        activityList.add("Nézelődik");

        return activityList;
    }

    @Override
    public String makeSound() {
        return "...";
    }

    @Override
    public String getLawNumber() {
        return this.lawNumber;
    }
}
