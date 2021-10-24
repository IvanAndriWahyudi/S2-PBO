/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Ivan Andri Wahyudi
 */
public class DPolaRekening{
    //properti
    String nomorRekening;
    String namaNasabah;
    String alamatNasabah;
    int saldo;
    
    //konstruktor
    public DPolaRekening(String nomorRekening, String namaNasabah, String alamatNasabah, int saldo){
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.alamatNasabah = alamatNasabah;
        this.saldo = saldo;
    }
    
    //metode 
    public void infoDataNasabah(){
        System.out.println("Nomor Rekening = " + nomorRekening);
        System.out.println("Nama Nasabah = " + namaNasabah);
        System.out.println("Alamat Nasabah = " + alamatNasabah);
        System.out.println("");
    }
    public void infoTarikTunai(){
        int ambil = 1;
        infoDataNasabah();
        while (saldo>= penarikanTunai() +50000){
            System.out.println("saldo awal " + saldo);
        }
    }
}
public class Uas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
