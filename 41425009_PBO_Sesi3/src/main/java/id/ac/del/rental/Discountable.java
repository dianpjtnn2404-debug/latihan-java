/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.ac.del.rental;

import id.ac.del.test.*;

/**
 *
 * @author dianp
 */
public interface Discountable {
    // Mengembalikan NOMINAL potongan (bukan harga akhir)
    double calculateDiscount(double amount);
}
