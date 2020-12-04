/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan54.koordinat;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan koordinat warna 
 * dengan metode pendekatan berbasis objek
 */
public class IF110119040Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat hasil = new WarnaKoordinat("nama", 10, 4);
        hasil.setNamawarna("jingga");
        System.out.println("Warna Koordinat : "+hasil.getNamawarna());
        hasil.setX(10);
        hasil.setY(4);
        System.out.println("Koordinat Sumbu x : "+hasil.getX()+","+"y :"+hasil.getY());
    }
    
}
