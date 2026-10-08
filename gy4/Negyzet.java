package gy4;

public class Negyzet extends Teglalap{
    public Negyzet(double oldalhossz) {
        super(oldalhossz, oldalhossz);
    }

    public double getOldalhossz(){
        return this.getHosszabbOldal();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Negyzet{");
        sb.append("oldalhossz=").append(getHosszabbOldal());
        sb.append('}');
        return sb.toString();
    }
}
