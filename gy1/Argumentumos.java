package gy1_18;

public class Argumentumos {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for (String arg  : args) {
            System.out.println(arg);
        }


    }
}
