/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author dianp
 */
// Kelas untuk menghitung tarif ongkir dengan teknik Method Overloading
class MesinTarif {
    private String kotaAsal;

    // Konstruktor kelas MesinTarif
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Method 1: Menhitung ongkir standar berdasarkan berat (Kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Method 2: Overloading dengan parameter tambahan nilaiBarang untuk menghitung asuransi
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01; // Biaya asuransi 1% dari nilai barang
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Method 3: Overloading dengan parameter tipe boolean untuk pengiriman express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000; // Biaya tambahan kilat Rp20.000
        }
        return total;
    }
}
