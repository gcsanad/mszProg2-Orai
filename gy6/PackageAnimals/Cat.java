package gy6.PackageAnimals;

import gy6.PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Cat extends PetMammal {

    public Cat(String name) {
        super(name, 4, "ahol van");
    }


    @Override
    public void setHome(String home) {
        super.setHome(home);
    }

    @Override
    public String getHome() {
        return super.getHome();
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> activityList = new ArrayList<>();
        activityList.add("Nyávog");
        activityList.add("Karmolászik");
        activityList.add("Sétál");


        return activityList;
    }

    @Override
    public String makeSound() {
        return "Miau";
    }
}
