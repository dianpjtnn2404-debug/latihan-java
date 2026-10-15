/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author dianp
 */
// Class Anak (Subclass) yang mewarisi class Mahasiswa
class MahasiswaAktif extends Mahasiswa {
    int semester;

    // Method belajar() untuk menampilkan aktivitas
    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}