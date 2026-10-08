package gy2;

public class Tort {
    private int szamlalo;
    private int nevezo;

    public Tort(int sz, int n){
        this.szamlalo = sz;
        this.nevezo = n;
    }

    public Tort(int egesz){
        this.szamlalo = egesz;
        this.nevezo = 1;
    }

    public Tort (){
        this.szamlalo = 0;
        this.nevezo = 1;
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


    public String toString() {
        return "Tort(" + this.szamlalo + " / " + this.nevezo + ")";
    }
}
