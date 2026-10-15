/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author dianp
 */
// Class Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // 1. Instansiasi objek dari class MahasiswaAktif
        MahasiswaAktif ma = new MahasiswaAktif();

        // 2. Mengisi data ke atribut objek
        ma.nama = "Dina";
        ma.nim = "123456";
        ma.semester = 5;

        // 3. Menampilkan informasi sesuai dengan output target
        System.out.println("Nama: " + ma.nama);
        System.out.println("NIM: " + ma.nim);
        
        // Memanggil method belajar()
        ma.belajar();
    }
}