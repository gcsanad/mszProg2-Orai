package gy6.PackageAnimals;

import gy6.PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Dog extends PetMammal {


    public Dog(String name) {
        super(name, 4, "valahol");
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> activityList = new ArrayList<>();
        activityList.add("Ugat");
        activityList.add("Alszik");
        activityList.add("Labdat kerget");


        return activityList;
    }

    @Override
    public String makeSound() {
        return "Vau vau vau";
    }
}
