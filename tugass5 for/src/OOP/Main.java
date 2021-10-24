package OOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner 15(System.in);

	    int bil, angka;
	    long hasil = 1;

        System.out.print("Masukan Angka = ");
        angka = input.nextInt();

        for (bil = angka ; bil >= 1 ; bil --){
            hasil = hasil * bil;

        }
        System.out.println("Hasil " + angka + "! = " + hasil );
    }
}
