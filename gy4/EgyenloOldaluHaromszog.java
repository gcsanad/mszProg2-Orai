package gy4;

public class EgyenloOldaluHaromszog extends Sokszog{
    private double oldalhossz;

    public EgyenloOldaluHaromszog(double oldalhossz) {
        super(3);
        this.oldalhossz = oldalhossz;
    }

    @Override
    public double kerulet() {
        return this.getOldalhossz()*3;
    }

    @Override
    public double terulet() {
        return (Math.pow(this.getOldalhossz(), 2)*Math.sqrt(3))/4;
    }

    public double getOldalhossz() {
        return oldalhossz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EgyenloOldaluHaromszog{");
        sb.append("oldalhossz=").append(getOldalhossz());
        sb.append('}');
        return sb.toString();
    }
}
