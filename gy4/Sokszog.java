package gy4;

public abstract class Sokszog {
    private int szogekSzama;


    public abstract double kerulet();
    public  abstract double terulet();


    public Sokszog(int szogekSzama) {
        this.szogekSzama = szogekSzama;
    }





    public int getSzogekSzama() {
        return szogekSzama;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sokszog{");
        sb.append("szogekSzama=").append(getSzogekSzama());
        sb.append('}');
        return sb.toString();
    }
}
