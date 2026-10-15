/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

import id.ac.del.test.*;

/**
 *
 * @author dianp
 */
public class FlashSaleDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.25;
    }
}
