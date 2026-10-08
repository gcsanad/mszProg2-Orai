package gy2;

public class TortMain {
    public static void main(String[] args) {
        Tort2 t1 = new Tort2(3, 8);
        Tort2 t2 = new Tort2(5, 4);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(Tort2.getObjDarabszam());
        System.out.println(t1.equals(t2));
        t1.pluszTort(t2);
        System.out.println(t1);

    }
}
