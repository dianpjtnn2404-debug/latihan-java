/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1;

/**
 *
 * @author dianp
 */
import java.util.*;

// Kelas Mantra untuk mendemonstrasikan Method Overloading
public class Mantra {
    // Method ucapkan() dengan 1 parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload 1: method ucapkan() dengan 2 parameter (namaMantra & kekuatan)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Instruksi Modul: Overload baru dengan parameter String namaMantra dan String target
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " ke target " + target);
        System.out.println("Efek: " + target + " terkena dampak mantra dasar.");
    }

    // Instruksi Modul: Overload dengan urutan parameter berbeda (int kekuatan, String namaMantra)
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra " + namaMantra + " dengan tingkat kekuatan " + kekuatan);
    }

    // Overload 2: method ucapkan() dengan 3 parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        
        // Memanggil berbagai variasi overloading
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", "Death Eater"); // Menjalankan overload baru (String, String)
        mantra.ucapkan(8, "Stupefy");                  // Menjalankan overload baru (int, String)
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}


// MENJAWAB PERTANYAAN
/*
1. Apa yang terjadi jika kita menghapus salah satu method overloading?
Jawaban: Jika method dengan parameter tertentu dihapus (misal yang memuat 2 parameter), pemanggilan yang cocok dengan bentuk tersebut akan menyebabkan Compile-Time Error karena Java tidak menemukan method signature yang sesuai.

2. Bisakah membuat method overloading dengan urutan parameter berbeda?
Jawaban: Bisa. Java membedakan method berdasarkan Method Signature (tipe, jumlah, dan urutan parameter). ucapkan(String, int) dan ucapkan(int, String) dianggap dua method yang berbeda.

*/
