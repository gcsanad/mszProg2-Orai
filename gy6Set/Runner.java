package gy6Set;

import com.sun.source.tree.Tree;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //HashSet
//        Building b1 = new Building("DEIK", "Kassai ut 26");
//        Building b2 = new Building("deik", "Kassai ut 26");
//        Building b3 = new Building("DEIK", "Kassai 26");
//        Building b4 = new Building("foepulet", "Egyetem ter 1");
//
//        HashSet<Building> buildings = new HashSet<>();
//        buildings.add(b1);
//        buildings.add(b2);
//        buildings.add(b3);
//        buildings.add(b4);
//
//        Building testBuilding = new Building("valami", "valahol");
//
//        boolean exists = buildings.contains(testBuilding);
//        System.out.println(exists);
//
//        boolean added = buildings.add(testBuilding);
//        System.out.println(added);
//
//        boolean removed = buildings.remove(testBuilding);
//        System.out.println(removed);
//        removed = buildings.remove(testBuilding);
//        System.out.println(removed);
//
//
//        System.out.println(buildings.isEmpty());
//
//        buildings.clear();
//
//        System.out.println(buildings.isEmpty());

//        TreeSet<Room> rooms= new TreeSet<>(Comparator.comparing(Room::getNumberOfSeats).reversed()
//                                            .thenComparing(Room::getRoomId));
//
//        Building b1 = new Building("DEIK", "Kassai ut 26");
//        Building b2 = new Building("deik", "Kassai ut 26");
//        Building b3 = new Building("DEIK", "Kassai 26");
//        Building b4 = new Building("foepulet", "Egyetem ter 1");
//
//        Room r1 = new Room(b1, "IK-105");
//        r1.setNumberOfSeats(18);
//        r1.addAttribute("projektor");
//        r1.addAttribute("gepterem");
//        Room r2 = new Room(b1, "IK-203");
//        r2.setNumberOfSeats(18);
//        Room r3 = new Room(b4, "F-20");
//        r3.setNumberOfSeats(25);
//        Room r4 = new Room(b4, "F-15");
//        r4.setNumberOfSeats(22);
//        rooms.add(r1);
//        rooms.add(r2);
//        rooms.add(r3);
//        rooms.add(r4);
//
//        Room r5 = new Room(b4, "F-15");
//
//        rooms.add(r5);
//
////        for (Room room : rooms) {
////            System.out.println(room);
////        }
//
//        System.out.println(rooms.size());
//
//        System.out.println(rooms.isEmpty());
//
//        boolean exists = rooms.contains(r2);
//        System.out.println(exists);
//
//        Room firstroom = rooms.first();
//        Room lastRoom = rooms.last();
//
//        System.out.println(firstroom);
//        System.out.println(lastRoom);
//        Room secondRoom = rooms.higher(r2);
//        System.out.println(secondRoom);
//
//        Room firstRoomTmp = rooms.lower(secondRoom);
//        System.out.println(firstRoomTmp);
//
//        System.out.println("Fordított sorrend: \n");
//        for (Room room : rooms.descendingSet()) {
//            System.out.println(room);
//        }

        //HashMap
        Building b1 = new Building("DEIK", "Kassai ut 26");
        Building b2 = new Building("deik", "Kassai ut 26");
        Building b3 = new Building("DEIK", "Kassai 26");
        Building b4 = new Building("foepulet", "Egyetem ter 1");

        Room r1 = new Room(b1, "IK-105");
        r1.setNumberOfSeats(18);
        r1.addAttribute("projektor");
        r1.addAttribute("gepterem");
        Room r2 = new Room(b1, "IK-203");
        r2.setNumberOfSeats(18);
        Room r3 = new Room(b4, "F-20");
        r3.setNumberOfSeats(25);
        Room r4 = new Room(b4, "F-15");
        r4.setNumberOfSeats(22);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);

        HashMap<Building, ArrayList<Room>> roomsByBuilding = new HashMap<>();

        // OG
        for (Room room : rooms) {
            ArrayList<Room> al;
            if (roomsByBuilding.containsKey(room.getBuilding())){
                al = roomsByBuilding.get(room.getBuilding());
            }
            else{
                al = new ArrayList<>();
            };
            al.add(room);
            roomsByBuilding.put(room.getBuilding(), al);
        }

        // Modern
        for (Room room : rooms) {
            roomsByBuilding
                    .computeIfAbsent(room.getBuilding(), building -> new ArrayList<>())
                    .add(room);
        }

        // Sima for
        for (Map.Entry<Building, ArrayList<Room>> entry : roomsByBuilding.entrySet()){
            Building key = entry.getKey();
            ArrayList<Room> val = entry.getValue();
            System.out.println(key);
            System.out.println(val);
        };

        //foreach-el

        roomsByBuilding.forEach((building, buildingRooms) -> {
            System.out.println(building);

            for (Room buildingRoom : buildingRooms) {
                System.out.println("\t" + buildingRoom);
            }
        });


    }
}
