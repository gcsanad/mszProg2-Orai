package gy6Set;

import java.util.Objects;

public class Building {
    private String name, address;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Building building)) return false;
        return Objects.equals(name.toLowerCase(), building.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name.toLowerCase());
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", address='").append(getAddress()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
