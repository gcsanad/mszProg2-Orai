package gy6.PackageAbstractAnimals;

public interface Vertebrates extends Animal, Comparable<Vertebrates> {
    int getNumberOfLegs();
    int compareTo(Vertebrates o);
}
