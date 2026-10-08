package gy2;

public class StringBeolvasos {
    public static void main(String[] args) {
        String[] szovegTomb = {"as pfs4", "", "ASdasDdskf213"};

        for (String szoveg : szovegTomb){
            System.out.print("szoveg" + szoveg + "; ");
            System.out.print(szoveg.length() + "; ");
            System.out.print(szoveg.isBlank() + "; ");
            System.out.print(szoveg.contains(" ") + "; ");
            System.out.print(szoveg.toUpperCase() + "; \n");
        }
    }
}
