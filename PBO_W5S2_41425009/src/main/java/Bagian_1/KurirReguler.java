/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author dianp
 */
// Parent class untuk Kurir Regular
class KurirReguler {
    protected String name;

    public KurirReguler(String name) {
        this.name = name;
    }

    // Method dasar yang akan di-override oleh child class
    public void kirimBarang(String alamat) {
        System.out.println("Kurir " + name + " mengantar barang via darat ke " + alamat);
    }
}

// Subclass KurirDrone mewarisi KurirReguler
class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String name, String idDrone) {
        super(name);
        this.idDrone = idDrone;
    }

    // Overriding method kirimBarang dari parent class
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Drone [" + idDrone + "] menerbangkan barang via udara ke " + alamat);
    }
}


/*
1. Analisis Overloading (Bagian 1.1)

Pertanyaan 1: Mengapa compiler Java dapat menentukan method hitungOngkir mana yang dijalankan sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?
Jawaban: Compiler Java memeriksa Method Signature (kombinasi jumlah parameter, tipe data parameter, dan urutan parameter) saat pemanggilan method. Keputusan dipilih saat proses kompilasi (compile-time).   

Pertanyaan 2: Mengapa compiler menolak kode jika ditambahkan public int hitungOngkir(double beratKg) padahal tipe kembaliannya berbeda (int vs double)?
Jawaban: Karena Return Type (tipe kembalian) tidak termasuk dalam Method Signature. Dua method dengan nama dan daftar parameter yang sama persis namun beda tipe kembalian dianggap ambigu oleh compiler Java.

2. Analisis Overriding (Bagian 1.2)
Pengujian 1: Saat @Override dihilangkan dan nama method diubah menjadi kirimbarang (huruf 'b' kecil), panggil k2.kirimBarang("Gedung Graha Lt. 5").
Hasil: Output yang keluar adalah "Kurir SkyExpress mengantar barang via darat ke Gedung Graha Lt. 5" (perilaku parent class).

Pengujian 2: Tambahkan kembali anotasi @Override di atas method yang salah ketik (kirimbarang).   
Pesan Error: method does not override or implement a method from a supertype

Pertanyaan 3: Jelaskan fungsi utama anotasi @Override
Jawaban: Anotasi @Override berfungsi sebagai validasi/keamanan bagi programmer untuk memastikan bahwa method di child class benar-benar meng-override method di parent class. Jika ada salah ketik nama method atau perbedaan parameter, compiler akan langsung memberikan peringatan error saat kompilasi.

3. Analisis Abstraksi (Bagian 2.1
Eksperimen 1 Error Message: KendaraanEkspedisi is abstract; cannot be instantiated
Penjelasan: Kelas abstrak bersifat belum lengkap/masih berupa konsep kerangka dasar, sehingga Java melarang pembuatan objek fisik secara langsung menggunakan operator new.

Eksperimen 2 (Opsi Solusi IDE saat kelas MotorKurir menolak angkutBarang):
1. Option 1: Implement all abstract methods (Menambahkan dan mengimplementasikan method angkutBarang(String namaBarang) di dalam kelas MotorKurir).
2. Option 2: Make class 'MotorKurir' abstract (Mengubah kelas MotorKurir menjadi abstract class MotorKurir).



*/
