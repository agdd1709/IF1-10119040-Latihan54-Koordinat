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
public class WarnaKoordinat extends Koordinat {
    public  String namawarna;

    public WarnaKoordinat(String namawarna, int x, int y) {
        super(x, y);
        this.namawarna = namawarna;
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
}
