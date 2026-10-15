/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian3;

/**
 *
 * @author dianp
 */
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equalsIgnoreCase(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Instruksi Modul: Method untuk mengucapkan semua mantra yang telah dipelajari dalam 1 perintah
    public void ucapkanSemuaMantra() {
        System.out.println("\n=== " + nama + " Mengucapkan Semua Mantra yang Dipelajari ===");
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Belum belajar Lumos

        harry.belajarMantra(lumos);
        
        // Memanggil method baru ucapkanSemuaMantra()
        harry.ucapkanSemuaMantra();
    }
}


// MENJAWAB PERTANYAAN
/*
1.Bagaimana polymorphism dan abstract class bekerja sama?
Jawaban: Abstract class menentukan struktur dasar dan method kontrak (efek()), sedangkan polimorfisme memungkinkan daftar List<Mantra> menyimpan berbagai variasi kelas anak (Expelliarmus, Lumos, dll.) dan mengeksekusi method efek() masing-masing secara dinamis saat runtime.

2. Apa yang terjadi jika menambahkan mantra baru tanpa mengubah kelas Penyihir?
Jawaban: Sangat mudah (Extensible). Kita cukup membuat kelas turunan baru dari Mantra tanpa perlu mengubah baris kode apa pun di dalam kelas Penyihir.   

*/
