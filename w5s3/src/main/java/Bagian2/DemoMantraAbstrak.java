/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2;

/**
 *
 * @author dianp
 */
import java.util.*;

// Abstract class MantraAbstrak
abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: wajib diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Instruksi Modul: Subclass Lumos yang mewarisi MantraAbstrak
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat sihir.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos(); // Objek Lumos

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}


// MENJAWAB PERTANYAAN
/*
1. Apa yang terjadi jika mencoba membuat objek dari MantraAbstrak secara langsung (new MantraAbstrak())?
Jawaban: Terjadi error kompilasi: MantraAbstrak is abstract; cannot be instantiated. Kelas abstrak bersifat belum lengkap sehingga dilarang diinstansiasi secara langsung.

2. Mengapa perlu membuat abstract class? Apa keuntungannya?
Jawaban: Memaksa kelas turunan melengkapi method abstrak (efek()), menyediakan kerangka dasar (blueprint) yang konsisten, dan mencegah instansiasi objek acak yang belum terdefinisi.

*/
