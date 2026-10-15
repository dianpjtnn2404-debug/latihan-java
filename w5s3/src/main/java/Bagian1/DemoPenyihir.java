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

// Parent Class Penyihir
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Subclass HarryPotter
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Subclass Hermione
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Instruksi Modul: Subclass RonWeasley yang mewarisi Penyihir dan meng-override ucapkanMantra()
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan tongkat patahnya yang sedikit kacau!");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        // Polymorphism: Variabel bertipe Penyihir merujuk ke objek subclass berbeda
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley(); // Objek RonWeasley

        penyihir1.ucapkanMantra(); 
        penyihir2.ucapkanMantra(); 
        penyihir3.ucapkanMantra(); 
    }
}

// MENJAWAB PERTANYAAN
/*
1. Apa yang terjadi jika tidak menggunakan annotation @Override?
Jawaban: Kode tetap dapat berjalan. Namun, tanpa @Override, kompiler tidak akan memberi tahu jika terjadi salah ketik nama method atau kesalahan tipe parameter (sehingga dianggap method baru, bukan menimpa method induk).

2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Jawaban: Kita dapat memperlakukan semua penyihir melalui variabel tipe induk (Penyihir), lalu memanggil ucapkanMantra() tanpa perlu memeriksa secara manual apakah penyihir tersebut Harry, Hermione, atau Ron.

*/
