package gy4;

public class Teglalap extends Sokszog{
    private double hosszabbOldal, rovidebbOldal;

    public Teglalap(double hosszabbOldal, double rovidebbOldal) {
        super(4);
        this.hosszabbOldal = hosszabbOldal;
        this.rovidebbOldal = rovidebbOldal;

    }


    @Override
    public double kerulet() {
        return this.getHosszabbOldal() * 2 + this.getRovidebbOldal() * 2;
    }

    @Override
    public double terulet() {
        return this.getHosszabbOldal() * this.getRovidebbOldal();
    }

    public double getRovidebbOldal() {
        return rovidebbOldal;
    }

    public double getHosszabbOldal() {
        return hosszabbOldal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teglalap{");
        sb.append("rovidebbOldal=").append(getRovidebbOldal());
        sb.append(", hosszabbOldal=").append(getHosszabbOldal());
        sb.append('}');
        return sb.toString();
    }
}
