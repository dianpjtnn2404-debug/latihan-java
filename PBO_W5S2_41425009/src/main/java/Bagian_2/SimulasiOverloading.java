/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2;

/**
 *
 * @author dianp
 */
// Kelas utama untuk menguji Runtime Polymorphism (Overriding)
public class SimulasiOverriding {
    public static void main(String[] args) {
        KurirReguler k1 = new KurirReguler("Budi");
        // Polymorphism: Variabel bertipe parent class merujuk ke objek child class
        KurirReguler k2 = new KurirDrone("SkyExpress", "DRN-01");

        // Memanggil method kirimBarang
        k1.kirimBarang("Jl. Sisingamangaraja No. 12");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}
