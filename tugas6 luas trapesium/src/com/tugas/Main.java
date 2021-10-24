package com.tugas;

public class Main {

    public static void main(String[] args) {
       int alasAtas = 3;
       int alasBawah = 6;
       int tingi = 4;
       double luas;

        luas = 0.5 * (alasAtas + alasBawah) * tingi;
        System.out.println("MENGHITUNG LUAS TRAPESIUM");
        System.out.println("Luas    = 0.5 x (alas atas + alas bawah) x tinggi");
        System.out.println("        = 0.5 x (" + alasAtas + "cm + " + alasBawah + "cm) x " + tingi + "cm");
        System.out.println("        = "+ luas + "cm");
    }
}