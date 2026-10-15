/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author dianp
 */
package multiple_inheritance;

public interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}
