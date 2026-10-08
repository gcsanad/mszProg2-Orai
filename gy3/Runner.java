package gy3;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("asdasd1", 8);
        Vehicle v2 = new Vehicle("asdasd1", 16);

        System.out.println(v1.equals(v2));

        Car c1 = new Car("ABC123", 200);
        c1.setEngineToStop();



        Bicycle b1 = new Bicycle("sadafadawasd");

        Vehicle[] myVehicles = {v1, v2, c1, b1};





    }
}
