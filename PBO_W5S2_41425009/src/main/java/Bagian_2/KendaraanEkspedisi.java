/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2;

/**
 *
 * @author dianp
 */
// Abstract Class sebagai cetak biru kendaraan
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method tanpa isi/body
    public abstract void angkutBarang(String namaBarang);
}

// Subclass konkret 1
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat " + namaBarang + " ke dalam kontainer tertutup pendingin.");
    }
}

// Subclass konkret 2
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat " + namaBarang + " di bagasi belakang untuk distribusi kota.");
    }
}
