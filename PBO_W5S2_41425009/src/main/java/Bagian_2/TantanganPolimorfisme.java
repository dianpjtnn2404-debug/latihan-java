/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2;

/**
 *
 * @author dianp
 */
// Kelas abstrak induk untuk jenis kendaraan ekspedisi
abstract class KendaraanEkspedisi {
    protected String noPolisi;

    public KendaraanEkspedisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    // Method abstrak yang wajib diimplementasikan oleh setiap child class
    public abstract void angkutBarang();
}

class MotorKargo extends KendaraanEkspedisi {
    public MotorKargo(String noPolisi) {
        super(noPolisi);
    }

    @Override
    public void angkutBarang() {
        System.out.println("Motor [" + noPolisi + "] membawa dokumen & paket kecil via bagasi samping.");
    }
}

class TrukTronton extends KendaraanEkspedisi {
    public TrukTronton(String noPolisi) {
        super(noPolisi);
    }

    @Override
    public void angkutBarang() {
        System.out.println("Truk [" + noPolisi + "] mengangkut kontainer muatan besar.");
    }
}

public class TantanganPolimorfisme {
    public static void main(String[] args) {
        // Array bertipe parent class yang menyimpan berbagai macam tipe objek child class
        KendaraanEkspedisi[] armada = new KendaraanEkspedisi[3];
        armada[0] = new MotorKargo("BK 1111 AB");
        armada[1] = new TrukTronton("BK 8888 CD");
        armada[2] = new MotorKargo("BK 2222 EF");

        System.out.println("=== ITERASI POLIMORFISME ARMADA ===");
        // Menggunakan 1 for-loop untuk iterasi semua jenis objek
        for (KendaraanEkspedisi k : armada) {
            k.angkutBarang(); // Dipanggil secara dinamis sesuai tipe objek aslinya
        }
    }
}
