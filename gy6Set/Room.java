package gy6Set;

import java.util.ArrayList;
import java.util.Objects;

public class Room implements Comparable<Room> {
    private Building building;
    private String roomId;
    private int numberOfSeats;
    private ArrayList<String> attributes;

    public Room(Building building, String roomId) {
        this.building = building;
        this.roomId = roomId;
        this.attributes = new ArrayList<>();
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void addAttribute(String attr){
        this.attributes.add(attr);
    }

    public void delAttribute(String attr){
        this.attributes.remove(attr);
    }

    public Building getBuilding() {
        return this.building;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public ArrayList<String> getAttributes() {
        return this.attributes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("building=").append(getBuilding());
        sb.append(", roomId='").append(getRoomId()).append('\'');
        sb.append(", numberOfSeats=").append(getNumberOfSeats());
        sb.append(", attributes=").append(getAttributes());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Room o) {
        return this.getRoomId().compareTo(o.getRoomId());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Room room)) return false;
        return Objects.equals(building, room.building) && Objects.equals(roomId, room.roomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, roomId);
    }
}
