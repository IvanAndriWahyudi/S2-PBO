package com.tugas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int bilangan;
        System.out.println("MENENTUKAN BILANGAN GANJIL DAN GENAP");
        System.out.print("Masukan bilangan = ");
        bilangan = input.nextInt();

        if (bilangan % 2 == 0){
            System.out.println(bilangan + " adalah bilangan genap");
        }else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
