/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author dianp
 */
import java.util.ArrayList;
import java.util.List;

// 1. Abstract Class MantraPerlindungan
abstract class MantraPerlindungan {
    private final String nama;

    public MantraPerlindungan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract methods
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2a. Kelas Konkret Protego
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}

// 2b. Kelas Konkret Fidelius
class Fidelius extends MantraPerlindungan {
    private final String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan! Rahasia dilindungi oleh Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan. Lokasi rahasia kembali terlihat.");
    }
}

// 2c. Kelas Konkret MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    public MantraAntiApparition() {
        super("Anti-Apparition");
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif! Penyihir tidak dapat melakukan Apparition di area Hogwarts.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan.");
    }
}

// 3. Kelas SistemPertahanan
class SistemPertahanan {
    private final List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    // Method menambah mantra
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra perlindungan " + mantra.getNama() + " ditambahkan ke sistem pertahanan.");
    }

    // Method mengaktifkan semua mantra
    public void aktifkanSemuaMantra() {
        System.out.println("\n--- MENGAKTIFKAN SISTEM PERTAHANAN HOGWARTS ---");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Method menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n--- MENONAKTIFKAN SISTEM PERTAHANAN HOGWARTS ---");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// 4. Kelas Utama Demonstrasi
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwartsDefense = new SistemPertahanan();

        // Membuat objek mantra
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition();

        // Menambahkan ke sistem
        hogwartsDefense.tambahMantra(protego);
        hogwartsDefense.tambahMantra(fidelius);
        hogwartsDefense.tambahMantra(antiApparition);

        // Demonstrasi pengaktifan & penonaktifan
        hogwartsDefense.aktifkanSemuaMantra();
        hogwartsDefense.nonaktifkanSemuaMantra();
    }
}
