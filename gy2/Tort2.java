package gy2;

import java.util.Objects;

public class Tort2 {
    private int szamlalo, nevezo;
    static int tortSzamlalo = 0;




    public Tort2(int szamlalo, int nevezo) {
        tortSzamlalo++;
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;
    }

    public Tort2(int szamlalo) {
        tortSzamlalo++;
        this.szamlalo = szamlalo;
        this.nevezo = 1;
    }

    public Tort2() {
        tortSzamlalo++;
        this.szamlalo = 0;
        this.nevezo = 1;
    }

    public static int getObjDarabszam(){
        return tortSzamlalo;
    }

    public int getSzamlalo() {
        return this.szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public int getNevezo() {
        return this.nevezo;
    }

    public void setNevezo(int nevezo) {
        this.nevezo = nevezo;
    }

    private double calcErtek(){
        return (double) this.szamlalo / this.nevezo;
    }

    private int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    private void egyszerusit(){
        int lnko = this.gcd(this.szamlalo, this.nevezo);
        this.szamlalo /= lnko;
        this.nevezo /= lnko;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tort2{");
        sb.append("szamlalo=").append(szamlalo);
        sb.append(", nevezo=").append(nevezo);
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Tort2 tort2 = (Tort2) o;
//        return szamlalo == tort2.szamlalo && nevezo == tort2.nevezo;
//Metódus amivel egész szám * tört és tört * tört

    public void egeszSzammalSzorzas(int szam){
        this.szamlalo *= szam;
    }

    public void torttelSzorzas(Tort2 tort){
        this.szamlalo *= tort.szamlalo;
        this.nevezo *= tort.nevezo;
        this.egyszerusit();
    }

    public void pluszEgesz(int egesz){
        this.szamlalo += this.nevezo * egesz;
    }

    public void pluszTort(Tort2 tort){
        this.szamlalo = this.szamlalo * tort.nevezo + tort.szamlalo * this.nevezo;
        this.nevezo *= tort.nevezo;
        this.egyszerusit();
    }
@Override
public int hashCode() {
    return Objects.hash(szamlalo, nevezo);
}

//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tort2 tort2 = (Tort2) o;
        this.egyszerusit();
        tort2.egyszerusit();
        return szamlalo == tort2.szamlalo && nevezo == tort2.nevezo;
        //return calcErtek() == tort2.calcErtek();
    }
}
