package OOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int deret;

        System.out.println("\nProgram Deret Angka Dari yang Terbesar ke Terkecil  ");
        System.out.print("\nBanyak Deret Angka Yang Ditampilkan = ");
        deret = input.nextInt();

        while (deret > 0){
            System.out.print(deret + " ");
            deret --;
        }
        System.out.println();
    }
}
