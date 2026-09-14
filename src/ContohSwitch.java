/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dianp
 */
public class ContohSwitch {
    public static void main(String[] args) {
        int month = 8;
        String name;

        switch (month) {
            case 1: name = "January"; break;
            case 8: name = "August"; break;
            default: name = "Invalid"; break;
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeap(year) ? 29 : 28;
                break;
            default:
                break;
        }
    }
}
