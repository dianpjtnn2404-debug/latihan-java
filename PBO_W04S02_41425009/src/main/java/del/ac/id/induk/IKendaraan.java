/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author dianp
 */
public interface IKendaraan {
    void setJlhRoda (int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int valude);
    void setWarnaKendaraan(String value);
    void cetakInformasi (Object o);
    int getJlhRoda ();
    int getDimensiKendaraan();
    int getJlhSpion();
    float kalkulasiPercepatan (int jlhTorsi, float panjangGagang, float raasioGigi);
    String getWarnaKendaraan();
}
