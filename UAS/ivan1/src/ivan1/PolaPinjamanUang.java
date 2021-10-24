/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivan1;

/**
 *
 * @author Ivan Andri Wahyudi
 */

public class PolaPinjamanUang{
 public double jasaPinjaman(){
        double jasa = jumlahPinjaman * 2 / 100;
        return jasa + jumlahPinjaman;  
 }    
    //properti
    public String namaNasabah;
    public String nomorNasabah;
    public String alamatNasabah;
    public int jumlahPinjaman;
    public int jangkaWaktu;
    
    //konstruktor
    public PolaPinjamanUang(String namaNasabah, String nomorNasabah, String alamatNasabah, int jumlahPinjaman, int jangkaWaktu){
        this.namaNasabah=namaNasabah;
        this.nomorNasabah=nomorNasabah;
        this.alamatNasabah=alamatNasabah;
        this.jumlahPinjaman=jumlahPinjaman;
        this.jangkaWaktu=jangkaWaktu;
        
    }
    
    //metode
    public void displayDataPinjaman(){
        System.out.println("Nama    = " + namaNasabah);
        System.out.println("nomor   = " + nomorNasabah);
        System.out.println("alamat  = " + alamatNasabah);
        System.out.println("jumlah pinjaman = " + jumlahPinjaman);
        System.out.println("jangka waktu = " + jangkaWaktu);
        System.out.println("");
    }
    
        
    //metode 2
    public void displayPinjaman(){
        displayDataPinjaman();
        System.out.println("Angsuran perbulan = " + jasaPinjaman());
    }
    
    
}
    
public class PolaPinjamanUang  {
    public static void main(String[] args) {
    PolaPinjamanUang pnjm=new PolaPinjamanUang ("ivan", "08228401", "jl pendidikan", 2000000, 12);
    trkl.displayPinjaman();
    
}
}